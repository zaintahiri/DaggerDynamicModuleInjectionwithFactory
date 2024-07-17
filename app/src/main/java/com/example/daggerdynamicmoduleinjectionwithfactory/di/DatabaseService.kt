package com.example.daggerdynamicmoduleinjectionwithfactory.di

class DatabaseService(private val dbName:String) {
    fun getDataBaseName():String=dbName
}