package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import javax.inject.Inject

class GetTrips @Inject constructor(
    private val repo: TripsRepo
) {
    suspend operator fun invoke(id: String) = repo.getTrips(id)
}
