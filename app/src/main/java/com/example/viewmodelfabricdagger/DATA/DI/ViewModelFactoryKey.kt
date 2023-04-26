package com.example.viewmodelfabricdagger.DATA.DI

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass
//the key of my MAP
annotation class ViewModelFactoryKey {
    @Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER
    )
    @MapKey
    annotation class ViewModelKey(val value: KClass<out ViewModel>)


}