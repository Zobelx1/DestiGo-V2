package com.mobilebreakero.profile_domain.usecase.firestore

import com.mobilebreakero.profile_domain.GetSavedPlaces
import com.mobilebreakero.profile_domain.GetSavedTrips
import com.mobilebreakero.profile_domain.usecase.firestore.user.AddUser
import com.mobilebreakero.profile_domain.usecase.firestore.user.GetInterestedPlaces
import com.mobilebreakero.profile_domain.usecase.firestore.user.GetUserById
import com.mobilebreakero.profile_domain.usecase.firestore.user.GetUsers
import com.mobilebreakero.profile_domain.usecase.firestore.user.UpdateInterestedPlaces
import com.mobilebreakero.profile_domain.usecase.firestore.user.UpdateLocation
import com.mobilebreakero.profile_domain.usecase.firestore.user.UpdateProfilePhoto
import com.mobilebreakero.profile_domain.usecase.firestore.user.UpdateStatus
import com.mobilebreakero.profile_domain.usecase.firestore.user.UpdateUser
import com.mobilebreakero.profile_domain.usecase.firestore.user.UpdateUserSaved


data class UserUseCase(
    val addUser: AddUser,
    val getUserByID: GetUserById,
    val getUsers: GetUsers,
    val updateUser: UpdateUser,
    val updateUserLocation: UpdateLocation,
    val updateUserPhotoUrl: UpdateProfilePhoto,
    val updateUserStatus: UpdateStatus,
    val updateUserInterestedPlaces: UpdateInterestedPlaces,
    val getInterestedPlaces: GetInterestedPlaces,
    val updateUserSaved: UpdateUserSaved,
    val getSavedPlaces: GetSavedPlaces,
    val getSavedTrips: GetSavedTrips
)