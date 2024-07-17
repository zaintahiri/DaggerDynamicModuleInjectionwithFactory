package com.example.daggerdynamicmoduleinjectionwithfactory.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {
    fun databaseComponentFactory():DatabaseComponent.Factory
}