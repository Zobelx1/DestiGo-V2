package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import javax.inject.Inject

class GetTripsByCategories @Inject constructor(
    private val tripsRepo: TripsRepo
) {
    suspend operator fun invoke(categories: String) = tripsRepo.getTripsByCategory(categories)
}