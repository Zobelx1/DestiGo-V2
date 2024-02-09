package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository

class UpdateLocation(
    private val repo: UserRepository
) {
    suspend operator fun invoke(id: String, location: String) =
        repo.updateUserLocation(id = id, location = location)
}