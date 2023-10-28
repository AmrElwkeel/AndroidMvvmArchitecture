package com.tutorials.mvvm_architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}










/**
//app/
//├── src/
//│   ├── main/
//│   │   ├── java/
//│   │   │   ├── com/
//│   │   │   │   ├── yourappname/
//│   │   │   │   │   ├── data/
//│   │   │   │   │   │   ├── local/
//│   │   │   │   │   │   │   ├── dao/          (Room Database DAOs)
//│   │   │   │   │   │   │   ├── database/     (Database configuration)
//│   │   │   │   │   │   ├── remote/
//│   │   │   │   │   │   │   ├── api/          (Retrofit API interfaces)
//│   │   │   │   │   │   ├── repository/       (Repositories)
//│   │   │   │   │   │   ├── models/          (Entities or Data Models)
//│   │   │   │   │   │   ├── di/              (Dependency injection modules and components)
//│   │   │   │   │   ├── domain/
//│   │   │   │   │   │   ├── usecase/         (Use Cases or Interactors)
//│   │   │   │   │   ├── presentation/
//│   │   │   │   │   │   ├── common/          (Common UI components)
//│   │   │   │   │   │   ├── feature1/
//│   │   │   │   │   │   │   ├── view/        (Activities, Fragments, Views)
//│   │   │   │   │   │   │   ├── viewmodel/   (ViewModels)
//│   │   │   │   │   │   ├── feature2/
//│   │   │   │   │   │   │   ├── view/
//│   │   │   │   │   │   │   ├── viewmodel/
//│   │   │   │   │   │   ├── utils/             (Utility classes)
//│   │   │   │   │   ├── App.java               (Application class)
//│   ├── res/
//│   ├── ...
**/
