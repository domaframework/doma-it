plugins {
    kotlin("jvm")
    kotlin("kapt")
}

tasks {
    val jvmTarget = "1.8"

    compileKotlin {
        kotlinOptions.jvmTarget = jvmTarget
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = jvmTarget
    }
}

dependencies {
    val domaVersion: String by project
    kapt("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-kotlin:${domaVersion}")
    testImplementation(project(":common"))
}

spotless {
    kotlin {
        ktlint("0.38.1")
        trimTrailingWhitespace()
        endWithNewline()
    }
}
