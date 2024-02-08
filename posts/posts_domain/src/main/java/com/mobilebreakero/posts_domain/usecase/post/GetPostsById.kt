package com.mobilebreakero.auth_domain.usecase.firestore.post


import com.mobilebreakero.posts_domain.repo.PostsRepo
import javax.inject.Inject

class GetPostsById @Inject constructor(
    private val repo: PostsRepo
) {
    suspend operator fun invoke(id: String) = repo.getPostsByUserId(id)
}