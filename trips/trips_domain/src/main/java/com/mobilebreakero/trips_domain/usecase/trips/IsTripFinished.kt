package com.mobilebreakero.trips_domain.usecase.trips


import com.mobilebreakero.trips_domain.repo.TripsRepo
import com.mobilebreakero.trips_domain.repo.updateTripResponse
import javax.inject.Inject

class IsTripFinished @Inject constructor(
    private val tripRepo: TripsRepo
) {
    suspend operator fun invoke(tripId: String, finished: Boolean): updateTripResponse {
        return tripRepo.isTripFinished(tripId, finished = finished)
    }
}
