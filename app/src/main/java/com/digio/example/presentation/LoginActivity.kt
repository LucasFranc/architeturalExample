package com.digio.example.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digio.example.R
import com.digio.example.presenter.LoginPresenterImpl
import com.digio.example.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity(), LoginView {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = LoginPresenterImpl(this) // pode ser injetado com dagger
        btn_login.setOnClickListener {presenter.login(edt_email.text.toString(),edt_pass.text.toString())}
    }

    override fun invalidEmail() {
        Toast.makeText(this,"Email inválido",Toast.LENGTH_SHORT).show()
    }

    override fun invalidPass() {
        Toast.makeText(this,"Senha inválida",Toast.LENGTH_SHORT).show()
    }

    override fun onLoginSuccess() {
        Toast.makeText(this,"Loga no app",Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError() {
        Toast.makeText(this,"Mostra dialog de erro",Toast.LENGTH_SHORT).show()
    }

    override fun onServerError() {
        Toast.makeText(this,"Mostra dialog de erro de servidor",Toast.LENGTH_SHORT).show()
    }

    override fun showProgress() {
        Toast.makeText(this,"Mostra progress",Toast.LENGTH_SHORT).show()
    }

    override fun hideProgress() {
        Toast.makeText(this,"Esconde progress",Toast.LENGTH_SHORT).show()
    }

    override fun onConnectionFailed() {
        Toast.makeText(this,"Mostra erro de conexão",Toast.LENGTH_SHORT).show()
    }

    override fun onAuthError() {
        Toast.makeText(this,"Mostra erro de autorização",Toast.LENGTH_SHORT).show()
    }

}
