package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository


class UpdateStatus(
    private val repo: UserRepository
) {
    suspend operator fun invoke(id: String, status: String) =
        repo.updateUserStatues(id = id, status = status)
}