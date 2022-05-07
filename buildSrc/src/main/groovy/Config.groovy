class Config {
    static applicationId = 'com.fx.notes'
    static appName = 'MyAndroidNote'

    static compileSdkVersion = 32
    static minSdkVersion = 21
    static targetSdkVersion = 32
    static versionCode = 1
    static versionName = "1.0.0"
    static build_tools = "30.0.3"


    static kotlin_version = '1.5.10'


    static depConfig = [
            plugin          : [
                    gradle: "com.android.tools.build:gradle:4.1.3",
                    kotlin: "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version",
                    api   : "com.blankj:api-gradle-plugin:1.2",
            ],
            androidx        : [
                    appcompat            : "androidx.appcompat:appcompat:1.2.0",
                    multidex             : "com.android.support:multidex:2.0.1",
                    annotation           : "androidx.annotation:annotation:1.2.0",
                    documentfile         : "androidx.documentfile:documentfile:1.0.1",
                    corektx              : "androidx.core:core-ktx:1.6.0",
                    constraintlayout     : "androidx.constraintlayout:constraintlayout:2.0.4",



                    recyclerview         : "androidx.recyclerview:recyclerview:1.1.0",
                    material             : "com.google.android.material:material:1.2.0-alpha02",


            ],
            kotlin          : "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version",

            leakcanary      : [
                    debugApi: "com.squareup.leakcanary:leakcanary-android:2.7",
            ],
            blankj          : [
                    utilcode: "com.blankj:utilcode:1.30.6",
                    rxbus   : "com.blankj:rxbus:1.1"
            ],
            umeng           : [
                    common: "com.umeng.umsdk:common:9.4.4",
                    asms  : "com.umeng.umsdk:asms:1.4.1",
                    apm   : "com.umeng.umsdk:apm:1.5.2"
            ],

            okhttp3         : "com.squareup.okhttp3:okhttp:4.8.1",
            androidpdfviewer: "com.github.barteksc:android-pdf-viewer:3.2.0-beta.1",
            glide           : "com.github.bumptech.glide:glide:4.11.0",
            PhotoView       : "com.github.chrisbanes:PhotoView:2.3.0",


    ]


}


