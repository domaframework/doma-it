plugins {
    java
}

val domaVersion: String by project

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
}

dependencies {
    annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-core:${domaVersion}")
    testImplementation(project(":common"))
}
