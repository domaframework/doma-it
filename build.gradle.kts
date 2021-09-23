plugins {
    base
    id("com.diffplug.eclipse.apt") version "3.33.0" apply false
    id("com.diffplug.spotless") version "5.15.1" apply false
    id("org.seasar.doma.compile") version "1.1.0" apply false
    kotlin("jvm") version "1.5.31" apply false
    kotlin("kapt") version "1.5.31" apply false
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "com.diffplug.eclipse.apt")
    apply(plugin = "com.diffplug.spotless")
    apply(plugin ="org.seasar.doma.compile")

    tasks {
        fun Test.prepare(driver: String) {
            val urlKey = "$driver.url"
            val url = project.property(urlKey) ?: throw GradleException("The $urlKey property is not found.")
            this.systemProperty("driver", driver)
            this.systemProperty("url", url)
            maxHeapSize = "1g"
            useJUnitPlatform()
        }
        
        named<Test>("test") {
            val driver: Any by project
            prepare(driver.toString())
        }

        val h2 by registering(Test::class) {
            prepare("h2")
        }
        
        val mysql by registering(Test::class) {
            prepare("mysql")
        }

        val oracle by registering(Test::class) {
            prepare("oracle")
        }

        val postgresql by registering(Test::class) {
            prepare("postgresql")
        }
        
        val sqlserver by registering(Test::class) {
            prepare("sqlserver")
        }

        register("testAll") {
            dependsOn(h2, mysql, oracle, postgresql, sqlserver)
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
        "testImplementation"(platform("org.testcontainers:testcontainers-bom:1.16.0"))
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.8.1")
        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.8.1")
        "testRuntimeOnly"("com.h2database:h2:1.4.200")
        "testRuntimeOnly"("mysql:mysql-connector-java:8.0.26")
        "testRuntimeOnly"("com.oracle.database.jdbc:ojdbc8-production:18.15.0.0")
        "testRuntimeOnly"("org.postgresql:postgresql:42.2.24")
        "testRuntimeOnly"("com.microsoft.sqlserver:mssql-jdbc:8.4.1.jre8")
        "testRuntimeOnly"("org.testcontainers:mysql")
        "testRuntimeOnly"("org.testcontainers:oracle-xe")
        "testRuntimeOnly"("org.testcontainers:postgresql")
        "testRuntimeOnly"("org.testcontainers:mssqlserver")
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

gradle.taskGraph.whenReady {
    val enableAdditionalFeatures: String? by project
    allTasks.forEach {
        if (it.project.name == "jep") {
            it.onlyIf {
                enableAdditionalFeatures != null
            }
        }
    }
}
