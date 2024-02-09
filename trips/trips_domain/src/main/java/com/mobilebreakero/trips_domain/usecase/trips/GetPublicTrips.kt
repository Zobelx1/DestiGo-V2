package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import com.mobilebreakero.trips_domain.repo.getPublicTripsResponse
import javax.inject.Inject

class GetPublicTrips @Inject constructor(
    private val tripRepo: TripsRepo
) {
    suspend operator fun invoke(
        userId: String
    ): getPublicTripsResponse {
        return tripRepo.getPublicTrips(userId)
    }
}