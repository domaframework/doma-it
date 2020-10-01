plugins {
    java
}

val javaLanguageVersion = JavaLanguageVersion.of(15)

// This block must be located before the java block
tasks {
    val encoding = "UTF-8"

    withType<JavaCompile> {
        options.encoding = encoding
        options.compilerArgs.addAll(listOf("--enable-preview", "--release", "$javaLanguageVersion", "-Xlint:preview"))
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
        languageVersion.set(javaLanguageVersion)
    }
}

spotless {
    java {
        googleJavaFormat("1.9")
    }
}

