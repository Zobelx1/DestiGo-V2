package com.mobilebreakero.trips_domain.usecase.trips

import com.mobilebreakero.trips_domain.repo.TripsRepo
import javax.inject.Inject

class UpdatePhoto @Inject constructor(
    private val repo: TripsRepo
) {
    suspend operator fun invoke(
        photo: String,
        id: String
    ) = repo.updatePhoto(photo, id)
}
