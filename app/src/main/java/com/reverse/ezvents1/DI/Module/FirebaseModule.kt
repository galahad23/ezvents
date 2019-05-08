package com.reverse.ezvents1.DI.Module

import android.content.Context
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FirebaseModule {

    @Provides
    @Singleton
    fun providesFirestore(context: Context): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }
}