package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository

class UpdateProfilePhoto(
    private val repo: UserRepository
) {
    suspend operator fun invoke(id: String, photoUrl: String) =
        repo.updateUserPhotoUrl(id = id, photoUrl = photoUrl)
}