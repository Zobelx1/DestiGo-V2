package com.mobilebreakero.trips_domain.usecase.trips

import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener

import com.mobilebreakero.trips_domain.repo.TripsRepo
import com.mobilebreakero.trips_domain.repo.addTripResponse
import javax.inject.Inject

class AddPublicTrips @Inject constructor(
    private val tripRepo: TripsRepo
) {
    suspend operator fun invoke(
        trip: com.mobilebreakero.core_domain.model.TripsItem,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ): addTripResponse {
        return tripRepo.savePublicTrip(trip, onSuccessListener, onFailureListener)
    }
}