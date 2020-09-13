plugins {
    kotlin("jvm")
    kotlin("kapt")
}

val domaVersion = project.findProperty("domaVersion") ?: "2.+"

spotless {
    kotlin {
        ktlint("0.38.1")
        trimTrailingWhitespace()
        endWithNewline()
    }
}

dependencies {
    kapt("org.seasar.doma:doma-processor:${domaVersion}")
    implementation("org.seasar.doma:doma-kotlin:${domaVersion}")
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