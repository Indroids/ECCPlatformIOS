import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    kotlin("multiplatform") version "2.3.0"
}

val eccVersion: String = project.findProperty("ecc.version") as String? ?: "+"

kotlin {
    val xcf = XCFramework("ECCPlatform")

    listOf(iosArm64(), iosSimulatorArm64()).forEach { target ->
        target.binaries.framework {
            baseName = "ECCPlatform"
            isStatic = true
            xcf.add(this)
            export("com.ind.eccsdui:ecc-platform:$eccVersion")
        }
    }

    sourceSets {
        commonMain.dependencies {
            api("com.ind.eccsdui:ecc-platform:$eccVersion")
        }
    }
}
