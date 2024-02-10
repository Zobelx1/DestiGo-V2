package com.mobilebreakero.home_ui.viewModel.viewModel

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobilebreakero.core_domain.util.Response

import com.mobilebreakero.posts_domain.repo.*
import com.mobilebreakero.posts_domain.usecase.PostUseCase
import com.mobilebreakero.profile_domain.usecase.firestore.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val postUseCase: PostUseCase,
    private val userUseCase: UserUseCase,
) : ViewModel() {

    init {
        getPosts()
    }

    private val _postsFlow = MutableStateFlow<postResponse>(Response.Loading)
    val postsFlow: StateFlow<postResponse> get() = _postsFlow

    fun getPosts() {
        viewModelScope.launch {
            try {
                val result = postUseCase.getPosts()
                if (result is Response.Success) {
                    val posts = result.data
                    _postsFlow.value = Response.Success(posts)
                } else {
                    _postsFlow.value = result
                }
            } catch (e: Exception) {
                _postsFlow.value = Response.Failure(e)
            }
        }
    }

    private val _postsIdFlow = MutableStateFlow<postResponse>(Response.Loading)
    val postsIdFlow: StateFlow<postResponse> get() = _postsFlow

    var postsResult by mutableStateOf(listOf<com.mobilebreakero.core_domain.model.Post>())

    fun getPostsById(userId: String) {
        viewModelScope.launch {
            try {
                val result = postUseCase.getPostsByUserId(userId)
                if (result is Response.Success) {
                    val posts = result.data
                    postsResult = posts
                    _postsIdFlow.value = Response.Success(posts)
                } else {
                    _postsIdFlow.value = result
                }
            } catch (e: Exception) {
                _postsIdFlow.value = Response.Failure(e)
            }
        }
    }


    var updateLikesResponse by mutableStateOf<updatePostResponse>(Response.Success(false))
        private set

    fun likePost(
        postId: String,
        likes: Int,
        userId: String,
        context: Context
    ) {
        viewModelScope.launch {
            try {
                updateLikesResponse = Response.Loading
                updateLikesResponse = postUseCase.likePost(postId, likes, userId, context)
            } catch (e: Exception) {
                updateLikesResponse = Response.Failure(e)
            }
        }
    }

    var sharePostResponse by mutableStateOf<addPostResponse>(Response.Success(false))
        private set

    fun sharePost(postId: String, userId: String, userName: String) {
        viewModelScope.launch {
            try {
                sharePostResponse = Response.Loading
                sharePostResponse =
                    postUseCase.sharePost(postId = postId, userId = userId, userName = userName)
            } catch (e: Exception) {
                sharePostResponse = Response.Failure(e)
            }
        }
    }


    var addCommentResponse by mutableStateOf<updatePostResponse>(Response.Success(false))
        private set

    fun addComment(postId: String, comment: String, userId: String, userName: String) {
        viewModelScope.launch {
            try {
                addCommentResponse = Response.Loading
                addCommentResponse = postUseCase.addComment(
                    id = postId,
                    comment = comment,
                    userId = userId,
                    userName = userName
                )
            } catch (e: Exception) {
                addCommentResponse = Response.Failure(e)
            }
        }
    }


    private val details =
        MutableStateFlow<postDetailsResponse>(Response.Success(com.mobilebreakero.core_domain.model.Post()))
    val detailsResult: StateFlow<postDetailsResponse> = details


    fun getPostDetails(id: String) {
        viewModelScope.launch {
            try {
                details.value = Response.Loading
                val result = postUseCase.getPostDetails(id)
                details.value = result
            } catch (e: Exception) {
                details.value = Response.Failure(e)
            }
        }
    }


    var userRecommendations by mutableStateOf(listOf<com.mobilebreakero.core_domain.model.TripsItem?>())
        private set


    var deletePostResponse by mutableStateOf<updatePostResponse>(Response.Success(false))
        private set

    fun deletePost(postId: String) {
        viewModelScope.launch {
            try {
                deletePostResponse = Response.Loading
                deletePostResponse = postUseCase.deletePost(postId)
            } catch (e: Exception) {
                deletePostResponse = Response.Failure(e)
            }
        }
    }
}

