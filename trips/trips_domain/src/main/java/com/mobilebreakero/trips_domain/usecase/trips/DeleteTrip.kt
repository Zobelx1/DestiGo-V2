package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import javax.inject.Inject

class DeleteTrip @Inject constructor(
    private val repo : TripsRepo
){
    suspend operator fun invoke(
        id: String
    ) = repo.deleteTrip(id)
}
