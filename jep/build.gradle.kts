plugins {
    java
}

tasks {
    val encoding = "UTF-8"

    withType<JavaCompile> {
        options.encoding = encoding
    }

    withType<Test> {}
}

dependencies {
    val domaVersion: String by project
    annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-core:${domaVersion}")
    testImplementation(project(":common"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}

spotless {
    java {
        googleJavaFormat("1.11.0")
    }
}

