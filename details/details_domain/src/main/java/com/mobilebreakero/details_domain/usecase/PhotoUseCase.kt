package com.mobilebreakero.details_domain.usecase

import com.mobilebreakero.core_domain.model.PhotoDataItem
import com.mobilebreakero.core_domain.util.Response
import com.mobilebreakero.details_domain.repo.PhotoRepository
import javax.inject.Inject

class PhotoUseCase @Inject constructor(private val repo: PhotoRepository) {
    suspend operator fun invoke(locationId: String): Response<List<PhotoDataItem?>> = repo.getPhotos(locationId)
}