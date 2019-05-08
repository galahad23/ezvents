package com.reverse.ezvents1.DI.Module

import android.content.Context
import com.reverse.ezvents1.EZVENTS
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(private val ezvents: EZVENTS) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return ezvents
    }
}