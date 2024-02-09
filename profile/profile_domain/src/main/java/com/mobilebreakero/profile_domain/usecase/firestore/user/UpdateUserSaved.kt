package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.mobilebreakero.core_domain.model.RecommendedPlaceItem
import com.mobilebreakero.core_domain.model.TripsItem
import com.mobilebreakero.profile_domain.UserRepository
import com.mobilebreakero.profile_domain.updateUserResponse
import javax.inject.Inject

class UpdateUserSaved @Inject constructor(
    private val repo: UserRepository
) {
    suspend operator fun invoke(
        id: String,
        savePlaces: RecommendedPlaceItem? = null,
        savedTrips: TripsItem? = null
    ): updateUserResponse = repo.updateUserSaved(id, savePlaces, savedTrips)
}
