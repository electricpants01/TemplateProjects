package com.example.retrofittemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofittemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

//    //picasso
//    implementation "com.squareup.picasso:picasso:2.8"
//    // retrofit
//    implementation 'com.google.code.gson:gson:2.8.9'
//    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
//    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
//    implementation 'com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.1'
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.1'
//
//    //lifecycle and navigation
//    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
//    implementation "androidx.activity:activity-ktx:1.4.0"
//    implementation "androidx.fragment:fragment-ktx:1.4.1"
//    implementation 'androidx.navigation:navigation-fragment-ktx:2.4.2'
//    implementation 'androidx.navigation:navigation-ui-ktx:2.4.2'
//    implementation "androidx.navigation:navigation-dynamic-features-fragment:2.4.2"
//
//    //room
//    def lifecycle_version = "2.5.0-beta01"
//    def room_version = "2.4.2"
//    implementation 'androidx.core:core-ktx:1.7.0'
//    implementation 'androidx.appcompat:appcompat:1.4.1'
//    implementation 'com.google.android.material:material:1.5.0'
//    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
//    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
//    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
//
//    implementation "androidx.room:room-runtime:$room_version"
//    kapt "androidx.room:room-compiler:$room_version"
}