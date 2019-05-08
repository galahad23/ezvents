package com.reverse.ezvents1

import android.app.Application
import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.reverse.ezvents1.DI.Component.AppComponent
import com.reverse.ezvents1.DI.Component.DaggerAppComponent
import com.reverse.ezvents1.DI.Module.ContextModule
import javax.inject.Inject

class EZVENTS:Application() {

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var firestore: FirebaseFirestore

    lateinit var component: AppComponent

    companion object {
        lateinit var instance: EZVENTS

        operator fun get(context: Context): EZVENTS {
            return context.applicationContext as EZVENTS
        }
    }

    override fun onCreate() {
        instance = this
        super.onCreate()
        component = DaggerAppComponent.builder().contextModule(ContextModule(this)).build()
        component.inject(this)

        // Set Up Firebase
        FirebaseApp.initializeApp(context)
        firestore.firestoreSettings = FirebaseFirestoreSettings.Builder()
            .setPersistenceEnabled(false)
            .build()
    }
}