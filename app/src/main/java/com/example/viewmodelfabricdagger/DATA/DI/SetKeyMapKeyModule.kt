package com.example.viewmodelfabricdagger.DATA.DI

import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey

@Module
 class SetKeyMapKeyModule(){

     @IntoSet
     @Provides
     fun foo():String{return "foo"}


    @IntoSet
    @Provides
    fun foo1():String{return "foo1"}




    @IntoMap
    @StringKey("MAP KEY")
    @Provides
    fun foo3():String{return "MAP MAP FOR MAPKEY "+"(#MAP KEY)"}

 }
