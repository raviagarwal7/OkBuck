package com.uber.okbuck.example

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AnalyticsModule::class,
            BindingModule::class
        ]
)

interface AppComponent: AndroidInjector<MainApp> {

    @Component.Factory
    abstract class Builder : AndroidInjector.Factory<MainApp>
}
