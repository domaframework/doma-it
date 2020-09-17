plugins {
    java
}

val domaVersion: String by project

tasks {
    val encoding = "UTF-8"

    compileJava {
        options.encoding = encoding
    }

    compileTestJava {
        options.encoding = encoding
    }
}

dependencies {
    annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-core:${domaVersion}")
    implementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
}
