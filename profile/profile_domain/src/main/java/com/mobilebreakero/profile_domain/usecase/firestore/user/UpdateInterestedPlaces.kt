package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository
import javax.inject.Inject

class UpdateInterestedPlaces @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(
        id: String,
        interestedPlaces: List<String>
    ) = userRepository.updateUserInterestedPlaces(
        id, interestedPlaces
    )
}