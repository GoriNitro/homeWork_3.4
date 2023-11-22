plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.homework_34"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.homework_34"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("com.github.bumptech.glide:glide:4.16.0") //glide
    implementation("androidx.appcompat:appcompat:1.6.1") //classical
    implementation("com.google.android.material:material:1.10.0") //classical
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") //classical
    testImplementation("junit:junit:4.13.2") //classical
    androidTestImplementation("androidx.test.ext:junit:1.1.5") //classical
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") //classical
}