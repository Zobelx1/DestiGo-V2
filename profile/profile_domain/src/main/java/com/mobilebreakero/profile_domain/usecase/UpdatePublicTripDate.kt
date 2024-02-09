package com.mobilebreakero.profile_domain.usecase


import com.mobilebreakero.core_domain.repo.RecommendedTrips
import com.mobilebreakero.core_domain.util.Response
import javax.inject.Inject

class UpdatePublicTripDate @Inject constructor(
    private val recommendedTrips: RecommendedTrips
) {
    suspend operator fun invoke(
        tripId: String,
        startDate: String?,
        endDate: String?
    ): Response<Boolean> = recommendedTrips.updatePublicTripDate(tripId, startDate, endDate)
}