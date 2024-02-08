package com.mobilebreakero.posts_domain.repo

import android.content.Context
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener

interface PostsRepo {

    suspend fun addPost(
        post: com.mobilebreakero.auth_domain.model.Post,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ): com.mobilebreakero.auth_domain.repo.addPostResponse

    suspend fun getPosts(): com.mobilebreakero.auth_domain.repo.postResponse

    suspend fun likePost(
        postId: String,
        like: Int,
        userId: String,
        context: Context
    ): com.mobilebreakero.auth_domain.repo.updatePostResponse

    suspend fun getPostsByUserId(userId: String): com.mobilebreakero.auth_domain.repo.postResponse

    suspend fun deletePost(postId: String): com.mobilebreakero.auth_domain.repo.updatePostResponse

    suspend fun sharePost(postId: String, userId: String, userName: String): com.mobilebreakero.auth_domain.repo.addPostResponse

    suspend fun addComment(
        postId: String,
        comment: String,
        userId: String,
        userName: String
    ): com.mobilebreakero.auth_domain.repo.updatePostResponse

    suspend fun getPostDetails(postId: String): com.mobilebreakero.auth_domain.repo.postDetailsResponse
}