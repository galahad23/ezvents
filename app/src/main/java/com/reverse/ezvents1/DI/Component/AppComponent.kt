package com.reverse.ezvents1.DI.Component

import com.reverse.ezvents1.DI.Module.ContextModule
import com.reverse.ezvents1.DI.Module.FirebaseModule
import com.reverse.ezvents1.DI.Module.RxModule
import com.reverse.ezvents1.EZVENTS
import com.reverse.ezvents1.View.Base.BaseActivity
import com.reverse.ezvents1.View.Event.EventActivity
import com.reverse.ezvents1.View.Home.HomeActivity
import com.reverse.ezvents1.View.Vendor.VendorActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class),(FirebaseModule::class),(RxModule::class)])
interface AppComponent {

    fun inject(ezvents: EZVENTS)

    fun inject(baseActivity: BaseActivity)

    fun inject(homeActivity: HomeActivity)

    fun inject(eventActivity: EventActivity)

    fun inject(vendorActivity: VendorActivity)
}