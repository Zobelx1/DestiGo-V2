package com.mobilebreakero.details_data.repoimpl

import com.mobilebreakero.auth_data.remote.TripApi
import com.mobilebreakero.core_domain.model.PhotoDataItem
import com.mobilebreakero.core_domain.util.Response
import com.mobilebreakero.details_domain.repo.PhotoRepository

class PhotoRepoImplementation(private val api: TripApi) : PhotoRepository {

    override suspend fun getPhotos(locationId: String): Response<List<PhotoDataItem?>> {
        return try {
            val response = api.getPhotos(locationId)
            if (response.isSuccessful) {
                Response.Success(response.body()!!.data)
            } else {
                Response.Failure(Exception(response.message()))
            }
        } catch (e: Exception) {
            Response.Failure(e)
        }
    }
}