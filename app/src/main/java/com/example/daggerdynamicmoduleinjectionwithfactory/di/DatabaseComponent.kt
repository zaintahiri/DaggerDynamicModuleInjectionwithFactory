package com.example.daggerdynamicmoduleinjectionwithfactory.di

import com.example.daggerdynamicmoduleinjectionwithfactory.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [DataBaseModule::class])
interface DatabaseComponent {
    //dynamic injection
    @Subcomponent.Factory
    interface  Factory{
        fun create(dataBaseModule: DataBaseModule):DatabaseComponent
    }
    //here we are defining where to inject the object
    fun inject(mainActivity: MainActivity)
}