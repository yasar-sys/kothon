// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()        // ✅ Required for Firebase + Android plugins
        mavenCentral()  // ✅ General plugins
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.3.0") // ✅ Make sure this matches your Flutter version
        classpath("com.google.gms:google-services:4.4.0") // ✅ Firebase plugin
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23") // ✅ Kotlin plugin
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

