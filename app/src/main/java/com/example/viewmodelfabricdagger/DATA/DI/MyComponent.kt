package com.example.viewmodelfabricdagger.DATA.DI

import com.example.viewmodelfabricdagger.PRESENTATION.MainActivity
import com.example.viewmodelfabricdagger.PRESENTATION.MyViewModel
import dagger.Component

@Component(modules = [ViewModelModule::class,SetKeyMapKeyModule::class])
interface MyComponent {
    fun inject (mainActivity: MainActivity)
    fun inject(myViewModel: MyViewModel)
}