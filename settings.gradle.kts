pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://repo.indroids.in/releases")
            credentials {
                username = System.getenv("ECC_REPO_USER") ?: ""
                password = System.getenv("ECC_REPO_PASS") ?: ""
            }
        }
    }
}

rootProject.name = "ECCPlatformBuild"
