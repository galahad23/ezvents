package com.reverse.ezvents1.View.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.reverse.ezvents1.R
import com.reverse.ezvents1.View.Base.BaseActivity

class HomeActivity : BaseActivity() {

    override fun inject() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
