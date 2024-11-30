pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
include(":app")
include(":unityLibrary")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        flatDir {
            dirs("${project(":unityLibrary").projectDir}/libs")
        }
    }
}



// 确保路径正确，指向 unityLibrary 目录
//project(":unityLibrary").projectDir = File("path/to/unityLibrary")

rootProject.name = "UnityAndroidTest"
//include(":unityLibrary")
project(":unityLibrary").projectDir = file("unityLibrary")