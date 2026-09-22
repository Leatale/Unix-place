plugins {
    id("com.android.application")
}

android {
    namespace = "com.unixgram.place"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.unixgram.place"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
}
