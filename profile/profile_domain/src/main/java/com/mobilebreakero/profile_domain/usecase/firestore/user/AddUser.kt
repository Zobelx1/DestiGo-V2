package com.mobilebreakero.profile_domain.usecase.firestore.user

import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.mobilebreakero.profile_domain.UserRepository

class AddUser(
    private val repo: UserRepository
) {
    suspend operator fun invoke(
        user: com.mobilebreakero.core_domain.model.AppUser,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener) =
        repo.addUser(user, onSuccessListener, onFailureListener)
}