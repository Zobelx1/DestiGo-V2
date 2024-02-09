package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository

class GetUsers (
    private val repo: UserRepository
) {
    suspend operator fun invoke() =
        repo.getUsers()
}

class GetUserById (
    private val repo: UserRepository
) {
    suspend operator fun invoke(id: String) =
        repo.getUserById(id)
}