package com.mobilebreakero.profile_domain.usecase

import com.mobilebreakero.core_domain.model.DataItem
import com.mobilebreakero.core_domain.repo.SearchResultRepo
import com.mobilebreakero.core_domain.util.Response

class SearchPlacesUseCase(
    private val searchResultRepo: SearchResultRepo
) {
    suspend operator fun invoke(
        query: String,
        language: String,
        filter: String
    ): Response<List<DataItem?>> =
        searchResultRepo.searchPlaces(query = query, language = language, filter = filter)
}