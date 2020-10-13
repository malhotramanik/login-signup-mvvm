package com.example.login_signup.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.login_signup.auth.data.repository.AuthRepository
import com.example.login_signup.auth.ui.viewmodel.AuthViewModel
import com.example.login_signup.base.repository.BaseRepository

class ViewModelFactory(private val repository: BaseRepository) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(repository as AuthRepository) as T
            else -> throw IllegalArgumentException("ViewModel Class Not Found")
        }
    }
}