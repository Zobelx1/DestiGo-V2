package com.mobilebreakero.domain.usecase

import com.mobilebreakero.domain.repo.AuthRepository
import kotlinx.coroutines.CoroutineScope

class GetAuthState(
    private val repo: AuthRepository
){
    operator fun invoke(viewModelScope: CoroutineScope) = repo.getAuthState(viewModelScope)
}