package com.mobilebreakero.core_domain.repo

import com.mobilebreakero.core_domain.model.DataItem
import com.mobilebreakero.auth_domain.util.Response

interface SearchResultRepo {

    suspend fun searchPlaces(
        query: String,
        language: String,
        filter: String
    ): Response<List<com.mobilebreakero.core_domain.model.DataItem?>>
}