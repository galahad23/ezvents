package com.reverse.ezvents1.View.Base

import javax.inject.Inject

open class BasePresenterImpl<T: BaseContract.View>@Inject constructor():BaseContract.Presenter<T> {

    var view: T? = null
    private set

    val isViewAttached: Boolean
    get() = view != null

    override fun attachView(view: T) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }

    fun checkViewAttached(){
        if (!isViewAttached) throw ViewNotAttachedException()
    }

    class ViewNotAttachedException : RuntimeException("Please call BaseContract.Presenter.attachView(BaseContract.View) before" + " requesting data to the BaseContract.Presenter")
}