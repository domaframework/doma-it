plugins {
    java
}

tasks {
    val encoding = "UTF-8"

    withType<JavaCompile> {
        options.encoding = encoding
        options.compilerArgs.addAll(listOf("--enable-preview", "-Xlint:preview"))
    }

    withType<Test> {
        jvmArgs("--enable-preview")
    }
}

dependencies {
    val domaVersion: String by project
    annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-core:${domaVersion}")
    testImplementation(project(":common"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(15))
    }
}

spotless {
    java {
        googleJavaFormat("1.9")
    }
}

