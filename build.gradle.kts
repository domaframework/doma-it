plugins {
    id("java")
    id("com.diffplug.eclipse.apt") version "3.24.0"
    id("com.diffplug.spotless") version "5.5.1"
    id("org.seasar.doma.compile") version "1.1.0"
}

val domaVersion = project.findProperty("domaVersion") ?: "2.+"

spotless {
    java {
        googleJavaFormat("1.7")
    }
}

tasks {
    val encoding = "UTF-8"

    compileJava {
        options.encoding = encoding
        options.compilerArgs = listOf("-Adoma.domain.converters=org.seasar.doma.it.domain.DomainConverterProvider")
    }

    compileTestJava {
        options.encoding = encoding
        options.compilerArgs.addAll(listOf("-proc:none"))
    }

    jar {
        manifest {
            attributes(mapOf("Implementation-Title" to project.name, "Implementation-Version" to archiveVersion))
        }
    }

    test {
        val jdbcUrl: Any by project
        val jdbcUser: Any by project
        val jdbcPassword: Any by project
        systemProperty("url", jdbcUrl)
        systemProperty("user", jdbcUser)
        systemProperty("password", jdbcPassword)
        useJUnitPlatform()
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-core:${domaVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
    testRuntimeOnly("com.h2database:h2:1.4.200")
    testRuntimeOnly("mysql:mysql-connector-java:8.0.21")
    testRuntimeOnly("org.postgresql:postgresql:42.2.16")
    testRuntimeOnly("com.microsoft.sqlserver:mssql-jdbc:8.4.1.jre8")
}

eclipse {
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
