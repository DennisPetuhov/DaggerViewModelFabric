package com.example.viewmodelfabricdagger.PRESENTATION

import android.app.Application
import com.example.viewmodelfabricdagger.DATA.DI.DaggerMyComponent
import com.example.viewmodelfabricdagger.DATA.DI.MyComponent

class App : Application(){
    lateinit var myComponent:MyComponent
    override fun onCreate() {
        super.onCreate()
        myComponent= DaggerMyComponent.create()
    }

}