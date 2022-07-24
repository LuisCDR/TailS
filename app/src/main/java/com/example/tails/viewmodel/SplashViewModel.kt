package com.example.tails.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tails.model.repository.UserRepository
import com.example.tails.model.repository.UserRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val userRepository: UserRepositoryImp
): ViewModel() {}