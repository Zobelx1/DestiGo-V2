package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository


class UpdateUser(
    private val repo: UserRepository
) {
    suspend operator fun invoke(id: String, name: String) =
        repo.updateUser(id = id, name = name)
}