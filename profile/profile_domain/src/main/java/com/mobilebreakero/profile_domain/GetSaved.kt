package com.mobilebreakero.profile_domain

import javax.inject.Inject

class GetSavedPlaces @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userId: String) = userRepository.getUserSavedPlaces(userId)
}

class GetSavedTrips @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userId: String) = userRepository.getUserSavedTrips(userId)
}