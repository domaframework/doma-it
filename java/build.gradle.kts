plugins {
    java
}

val domaVersion = project.findProperty("domaVersion") ?: "2.+"

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

spotless {
    java {
        googleJavaFormat("1.7")
    }
}

dependencies {
    annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-core:${domaVersion}")
}
