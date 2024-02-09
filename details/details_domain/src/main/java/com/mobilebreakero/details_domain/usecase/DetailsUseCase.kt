package com.mobilebreakero.details_domain.usecase


import com.mobilebreakero.details_domain.model.ReviewItem
import com.mobilebreakero.details_domain.repo.DetailsRepository
import javax.inject.Inject

class DetailsUseCase @Inject constructor(
    private val detailsRepository: DetailsRepository
) {
    suspend operator fun invoke(id: String) = detailsRepository.getDetails(id)
}

class GetReviewsUseCase @Inject constructor(
    private val detailsRepository: DetailsRepository
) {
    suspend operator fun invoke(): List<ReviewItem> = detailsRepository.getReviews()
}