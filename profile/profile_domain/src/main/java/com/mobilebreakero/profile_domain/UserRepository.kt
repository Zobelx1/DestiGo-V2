package com.mobilebreakero.profile_domain

import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.mobilebreakero.core_domain.model.AppUser
import com.mobilebreakero.core_domain.model.RecommendedPlaceItem
import com.mobilebreakero.core_domain.model.TripsItem
import com.mobilebreakero.core_domain.util.Response
import com.mobilebreakero.trips_domain.model.Trip
import kotlinx.coroutines.flow.Flow

typealias users = List<AppUser>
typealias tripsResponseInterested = Response<List<Trip>>
typealias savedTripsResponse = Response<List<TripsItem>>
typealias savedPlacesResponse = Response<List<RecommendedPlaceItem>>
typealias userResponse = Response<AppUser>
typealias addUserResponse = Response<Boolean>
typealias updateUserResponse = Response<Boolean>

interface UserRepository {

    suspend fun getUsers(): Flow<Response.Success<MutableList<AppUser>>>
    suspend fun getUserById(id: String): userResponse

    suspend fun addUser(
        user: AppUser,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ): addUserResponse

    suspend fun updateUser(id: String, name: String): updateUserResponse

    suspend fun updateUserStatues(id: String, status: String): updateUserResponse
    suspend fun updateUserLocation(id: String, location: String): updateUserResponse
    suspend fun updateUserPhotoUrl(id: String, photoUrl: String): updateUserResponse
    suspend fun updateUserInterestedPlaces(
        id: String,
        interestedPlaces: List<String>
    ): updateUserResponse

    suspend fun updateUserSaved(
        id: String,
        savePlaces: RecommendedPlaceItem? = null,
        savedTrips: TripsItem? = null
    ): updateUserResponse

    suspend fun getUserTripsBasedOnInterestedPlaces(id: String): tripsResponseInterested

    suspend fun getUserSavedPlaces(id: String): savedPlacesResponse
    suspend fun getUserSavedTrips(id: String): savedTripsResponse
}