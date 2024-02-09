package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.profile_domain.UserRepository
import javax.inject.Inject

class GetInterestedPlaces @Inject constructor(
    private val repo: UserRepository
) {
    suspend operator fun invoke(userId: String) = repo.getUserTripsBasedOnInterestedPlaces(userId)
}