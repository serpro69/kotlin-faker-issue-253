plugins {
    kotlin("jvm") version "2.0.20"
}

group = "io.github.serpro69"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation("io.github.serpro69:kotlin-faker:2.1.0-SNAPSHOT")
}

kotlin {
    jvmToolchain(17)
}
