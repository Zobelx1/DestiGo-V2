package com.mobilebreakero.details_domain.repo

import com.mobilebreakero.core_domain.model.PhotoDataItem
import com.mobilebreakero.core_domain.util.Response

interface PhotoRepository{
    suspend fun getPhotos(locationId: String): Response<List<PhotoDataItem?>>
}