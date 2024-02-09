package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import com.mobilebreakero.trips_domain.repo.updateTripResponse
import javax.inject.Inject

class UpdateTripName @Inject constructor(
    private val repo: TripsRepo
) {
    suspend operator fun invoke(
        tripName: String,
        tripId: String
    ) : updateTripResponse= repo.updateTripName(tripName, tripId)
}