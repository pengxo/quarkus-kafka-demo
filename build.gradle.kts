import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.net.URI

group = "com.test.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
    mavenLocal()
}


plugins {
    kotlin("jvm") version libs.versions.kotlin.jvm
    kotlin("plugin.allopen") version libs.versions.kotlin.plugin.allopen
    alias(libs.plugins.quarkus)
    //id("com.github.davidmc24.gradle.plugin.avro") version("1.9.1")
}

dependencies {
    implementation(enforcedPlatform(libs.quarkus.platform))
    implementation(libs.bundles.quarkus)
    implementation(libs.bundles.resteasy)
    implementation(libs.bundles.kotlin)
    implementation(libs.bundles.smallrye)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_21.toString()
    kotlinOptions.javaParameters = true
}

