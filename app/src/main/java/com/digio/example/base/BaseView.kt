package com.digio.example.base

interface BaseView {
    fun showProgress()
    fun hideProgress()
    fun onConnectionFailed()
    fun onAuthError()
}