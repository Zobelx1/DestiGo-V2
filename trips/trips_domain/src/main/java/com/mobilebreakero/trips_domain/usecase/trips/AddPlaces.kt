package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import javax.inject.Inject

class AddPlaces @Inject constructor(
    private val repo: TripsRepo
) {
    suspend operator fun invoke(
        placeName: String, placeId: String, id: String, placeTripId: String
    ) =
        repo.addPlaces(
            placeName = placeName,
            placeId = placeId,
            id = id,
            placeTripId = placeTripId
        )

}