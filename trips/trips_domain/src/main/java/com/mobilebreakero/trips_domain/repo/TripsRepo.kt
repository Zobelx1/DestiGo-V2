package com.mobilebreakero.trips_domain.repo

import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener

interface TripsRepo {

    suspend fun getTrips(id: String): com.mobilebreakero.auth_domain.repo.getTripsResponse

    suspend fun addTrip(
        trip: com.mobilebreakero.auth_domain.model.Trip, onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ): com.mobilebreakero.auth_domain.repo.addTripResponse

    suspend fun addCheckList(
        itemName: String,
        id: String,
        checked: Boolean = false,
        checkItemId: String
    ): com.mobilebreakero.auth_domain.repo.updateTripResponse

    suspend fun addPlaces(
        placeName: String, placeId: String, id: String, placeTripId: String
    ): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    fun updatePhoto(photo: String, id: String): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    fun deleteTrip(id: String): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    suspend fun getTripDetails(id: String): com.mobilebreakero.auth_domain.repo.getTripDetailsResponse

    suspend fun getTripsByCategory(categories: String): com.mobilebreakero.auth_domain.repo.getTripsResponse

    suspend fun updatePhotoPlace(
        photo: String, id: String
    ): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    suspend fun isPlaceVisited(
        isVisited: Boolean,
        placeId: String,
        tripId: String
    ): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    suspend fun addPlaceVisitDate(
        date: String,
        placeId: String,
        tripId: String
    ): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    suspend fun addTripJournal(
        journal: String,
        journalId: String,
        tripId: String,
        title: String,
        image: String,
        date: String
    ): com.mobilebreakero.auth_domain.repo.updatePlacesResponse

    suspend fun savePublicTrip(
        trip: com.mobilebreakero.auth_domain.model.TripsItem,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ): com.mobilebreakero.auth_domain.repo.addTripResponse

    suspend fun getPublicTrips(userId: String): com.mobilebreakero.auth_domain.repo.getPublicTripsResponse

    suspend fun updateTripName(
        tripName: String,
        tripId: String
    ): com.mobilebreakero.auth_domain.repo.updateTripResponse

    suspend fun updateTripDate(
        tripDate: String,
        tripId: String
    ): com.mobilebreakero.auth_domain.repo.updateTripResponse

    suspend fun updateTripDays(
        tripDays: String,
        tripId: String
    ): com.mobilebreakero.auth_domain.repo.updateTripResponse

    suspend fun isTripFinished(tripId: String, finished: Boolean): com.mobilebreakero.auth_domain.repo.updateTripResponse

    suspend fun getTripJournalDetails(
        tripId: String,
        journalId: String
    ): com.mobilebreakero.auth_domain.repo.getTripJournalDetailsResponse
}