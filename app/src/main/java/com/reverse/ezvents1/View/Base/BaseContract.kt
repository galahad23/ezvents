package com.reverse.ezvents1.View.Base

class BaseContract {

    interface View

    interface Presenter<V:View>{
        fun attachView(view: V)
        fun detachView()
    }
}