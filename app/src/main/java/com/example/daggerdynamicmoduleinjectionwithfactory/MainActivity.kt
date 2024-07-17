package com.example.daggerdynamicmoduleinjectionwithfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerdynamicmoduleinjectionwithfactory.di.DataBaseModule
import com.example.daggerdynamicmoduleinjectionwithfactory.di.DatabaseService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inject defines activity level scope for component
        (application as MyApplication).appComponent
            .databaseComponentFactory()
            .create(DataBaseModule("zain database")).inject(this)


        println("Database name : "+databaseService.getDataBaseName())

    }
}