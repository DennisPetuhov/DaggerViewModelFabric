package com.example.viewmodelfabricdagger.DATA.DI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfabricdagger.PRESENTATION.MyViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: DaggerViewModelFactory): ViewModelProvider.Factory//Provides ViewModelFactory

    @Binds
    @ViewModelFactoryKey.ViewModelKey(MyViewModel::class)
    @IntoMap()
    abstract fun viewModelIntoMap(myViewModel: MyViewModel): ViewModel  //provides a ViewModel


}