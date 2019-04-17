package com.digio.example.view

import com.digio.example.base.BaseView

interface LoginView : BaseView {
    fun invalidEmail()
    fun invalidPass()
    fun onLoginSuccess()
    fun onLoginError()
    fun onServerError()
}