package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import com.mobilebreakero.trips_domain.repo.updateTripResponse
import javax.inject.Inject

class UpdateTripDate @Inject constructor(
    private val repo: TripsRepo
) {
    suspend operator fun invoke(
        tripDate: String,
        tripId: String
    ) : updateTripResponse= repo.updateTripDate(tripDate, tripId)
}