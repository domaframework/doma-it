plugins {
    base
    id("com.diffplug.eclipse.apt") version "3.25.0" apply false
    id("com.diffplug.spotless") version "5.5.0" apply false
    id("org.seasar.doma.compile") version "1.1.0" apply false
    kotlin("jvm") version "1.4.10" apply false
    kotlin("kapt") version "1.4.10" apply false
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "com.diffplug.eclipse.apt")
    apply(plugin = "com.diffplug.spotless")
    apply(plugin ="org.seasar.doma.compile")

    tasks {
        named<Test>("test") {
            val jdbcUrl: Any by project
            val jdbcUser: Any by project
            val jdbcPassword: Any by project
            systemProperty("url", jdbcUrl)
            systemProperty("user", jdbcUser)
            systemProperty("password", jdbcPassword)
            maxHeapSize = "1g"
            useJUnitPlatform()
        }
        
        named("build") {
            dependsOn("spotlessApply")
        }
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.7.0")
        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.7.0")
        "testRuntimeOnly"("com.h2database:h2:1.4.200")
        "testRuntimeOnly"("mysql:mysql-connector-java:8.0.21")
        "testRuntimeOnly"("org.postgresql:postgresql:42.2.16")
        "testRuntimeOnly"("com.microsoft.sqlserver:mssql-jdbc:8.4.1.jre8")
    }

    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        java {
            googleJavaFormat("1.7")
        }
    }

    configure<org.gradle.plugins.ide.eclipse.model.EclipseModel> {
        classpath {
            file {
                whenMerged {
                    val classpath = this as org.gradle.plugins.ide.eclipse.model.Classpath
                    classpath.entries.removeAll {
                        when (it) {
                            is org.gradle.plugins.ide.eclipse.model.Output -> it.path == ".apt_generated"
                            else -> false
                        }
                    }
                }
                withXml {
                    val node = asNode()
                    node.appendNode("classpathentry", mapOf("kind" to "src", "output" to "bin/main", "path" to ".apt_generated"))
                }
            }
        }
        jdt {
            javaRuntimeName = "JavaSE-1.8"
        }
    }
}