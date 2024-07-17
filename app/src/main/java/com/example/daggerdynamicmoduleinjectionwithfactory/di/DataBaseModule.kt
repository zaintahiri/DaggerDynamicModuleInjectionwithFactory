package com.example.daggerdynamicmoduleinjectionwithfactory.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule(private val dbName:String) {

    @Provides
    fun getDataBaseObject():DatabaseService{
        return  DatabaseService(dbName)
    }
}