package com.example.daggerdynamicmoduleinjectionwithfactory

import android.app.Application
import com.example.daggerdynamicmoduleinjectionwithfactory.di.AppComponent
import com.example.daggerdynamicmoduleinjectionwithfactory.di.DaggerAppComponent

class MyApplication: Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.create()

    }
}