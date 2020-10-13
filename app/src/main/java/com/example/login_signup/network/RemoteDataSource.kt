package com.example.login_signup.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource {

    companion object {
        private const val BASE_URL = "http://simplifiedcoding.tech/mywebapp/public/api/"
    }

    fun <Api> buildApi(api: Class<Api>): Api {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(api)
    }
}