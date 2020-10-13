package com.example.login_signup.auth.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.login_signup.auth.data.api.AuthApi
import com.example.login_signup.auth.data.repository.AuthRepository
import com.example.login_signup.auth.ui.viewmodel.AuthViewModel
import com.example.login_signup.base.ui.BaseFragment
import com.example.login_signup.databinding.FragmentLoginBinding


class LoginFragment : BaseFragment<AuthViewModel, FragmentLoginBinding, AuthRepository>() {


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        viewModel
    }


    override fun getViewModel(): Class<AuthViewModel> = AuthViewModel::class.java

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?) = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): AuthRepository = AuthRepository(remoteDataSource.buildApi(AuthApi::class.java))

}