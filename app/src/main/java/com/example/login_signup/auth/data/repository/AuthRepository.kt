package com.example.login_signup.auth.data.repository

import com.example.login_signup.auth.data.api.AuthApi
import com.example.login_signup.base.data.repository.BaseRepository

class AuthRepository(private val api: AuthApi) : BaseRepository() {

    suspend fun login(
            email: String,
            password: String
    ) = safeApiCall { api.login(email, password) }
}