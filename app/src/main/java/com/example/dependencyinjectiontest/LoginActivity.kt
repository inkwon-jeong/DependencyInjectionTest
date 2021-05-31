package com.example.dependencyinjectiontest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    //  private lateinit var loginViewModel: LoginViewModel
    private lateinit var appContainer: AppContainer
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//    val retrofit = Retrofit.Builder()
//      .baseUrl("https://example.com")
//      .build()
//      .create(UserService::class.java)
//
//    val remoteDataSource = UserRemoteDataSource(retrofit)
//    val localDataSource = UserLocalDataSource(applicationContext)
//
//    val userRepository = UserRepository(localDataSource, remoteDataSource)
//
//    loginViewModel = LoginViewModel(userRepository)

//    val appContainer = (application as MyApplication).appContainer
//    loginViewModel = appContainer.loginViewModel

        appContainer = (application as MyApplication).appContainer

        appContainer.loginContainer = LoginContainer(appContainer.userRepository)
        loginViewModel = appContainer.loginContainer!!.loginViewModel
    }

    override fun onDestroy() {
        appContainer.loginContainer = null
        super.onDestroy()
    }
}