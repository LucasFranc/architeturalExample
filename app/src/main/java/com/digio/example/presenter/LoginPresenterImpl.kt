package com.digio.example.presenter

import com.digio.example.base.BasePresenter
import com.digio.example.view.LoginView

class LoginPresenterImpl(var view: LoginView) : LoginPresenter, BasePresenter() {

    override fun login(email: String?, pass: String?) {
        if (email == null || email.isEmpty()) {
            view.invalidEmail()
            return
        }

        if (pass == null || pass.isEmpty()) {
            view.invalidPass()
            return
        }

        view.showProgress()
//          Usar getAPI do BasePresenter ou interactor
//        getAPI.login(LoginRequest(email, pass)).enqueue(object : Callback<User> {
//            override fun onResponse(call: Call<User>, response: Response<User>) {
//
//                when (response.code()) {
//                    ServerStatusEnum.STATUS_OK.code, ServerStatusEnum.STATUS_CREATED.code -> {
                        view.onLoginSuccess()
//                    }
//
//                    ServerStatusEnum.STATUS_FORBIDDEN.code, ServerStatusEnum.STATUS_NOT_FOUND.code -> {
//
//                    }
//
//                    ServerStatusEnum.STATUS_UNAUTHORIZED.code -> {
//
//                    }
//
//                    else -> view.onServerError()
//                }
//
//                view?.hideProgress()
//            }
//
//            override fun onFailure(call: Call<User>, t: Throwable) {
//                if (t.message != null)
//                    view.onLoginError(t.message.toString())
//                else
//                    view.onLoginError("")
//            }
//        })
    }
}

interface LoginPresenter {
    fun login(login: String?, pass: String?)
}