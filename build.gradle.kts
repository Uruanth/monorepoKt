import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.spring.io/snapshot") }
}


tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

plugins {
    kotlin("jvm") version "1.9.0"
}
allprojects {
    repositories {
        mavenCentral()
    }
}


subprojects {


    apply(plugin = "kotlin")

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = "17"
        }
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_17
    }

    dependencies {
        testImplementation(kotlin("test"))
    }

}
