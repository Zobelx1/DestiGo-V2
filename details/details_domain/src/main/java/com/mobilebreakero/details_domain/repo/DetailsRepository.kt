package com.mobilebreakero.details_domain.repo

import com.mobilebreakero.core_domain.util.Response
import com.mobilebreakero.details_domain.model.ReviewItem
import com.mobilebreakero.details_domain.model.DetailsResponse


interface DetailsRepository {
    suspend fun getDetails(id: String): Response<DetailsResponse>
    suspend fun getReviews(): List<ReviewItem>
}