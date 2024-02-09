package com.mobilebreakero.destigo.di

import android.content.Context
import com.mobilebreakero.auth_data.remote.TripApi
import com.mobilebreakero.auth_data.repoimpl.RecommededImple
import com.mobilebreakero.auth_data.repoimpl.SearchPlacesRepoImpl
import com.mobilebreakero.auth_domain.usecase.firestore.post.*
import com.mobilebreakero.core_domain.repo.RecommendedTrips
import com.mobilebreakero.core_domain.repo.SearchResultRepo
import com.mobilebreakero.details_data.repoimpl.DetailsRepoImplementation
import com.mobilebreakero.details_domain.repo.DetailsRepository
import com.mobilebreakero.details_domain.repo.PhotoRepository
import com.mobilebreakero.details_domain.usecase.DetailsUseCase
import com.mobilebreakero.details_domain.usecase.GetReviewsUseCase
import com.mobilebreakero.details_domain.usecase.PhotoUseCase
import com.mobilebreakero.posts_domain.repo.*
import com.mobilebreakero.posts_domain.usecase.post.*
import com.mobilebreakero.posts_domain.usecase.PostUseCase
import com.mobilebreakero.profile_domain.*
import com.mobilebreakero.profile_domain.usecase.GetPublicTripsUseCase
import com.mobilebreakero.profile_domain.usecase.RecommendedPlaceUseCase
import com.mobilebreakero.profile_domain.usecase.RecommendedUseCase
import com.mobilebreakero.profile_domain.usecase.SearchPlacesUseCase
import com.mobilebreakero.profile_domain.usecase.UpdatePublicTripDate
import com.mobilebreakero.profile_domain.usecase.UpdatePublicTripDays
import com.mobilebreakero.profile_domain.usecase.firestore.*
import com.mobilebreakero.profile_domain.usecase.firestore.user.*
import com.mobilebreakero.trips_domain.repo.*
import com.mobilebreakero.trips_domain.usecase.TripsUseCase
import com.mobilebreakero.trips_domain.usecase.trips.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideFireStoreUseCases(
        repo: UserRepository
    ) = UserUseCase(
        addUser = AddUser(repo),
        getUsers = GetUsers(repo),
        updateUser = UpdateUser(repo),
        getUserByID = GetUserById(repo),
        updateUserLocation = UpdateLocation(repo),
        updateUserPhotoUrl = UpdateProfilePhoto(repo),
        updateUserStatus = UpdateStatus(repo),
        updateUserInterestedPlaces = UpdateInterestedPlaces(repo),
        getInterestedPlaces = GetInterestedPlaces(repo),
        updateUserSaved = UpdateUserSaved(repo),
        getSavedPlaces = GetSavedPlaces(repo),
        getSavedTrips = GetSavedTrips(repo),
    )

    @Provides
    fun provideTripsUseCases(
        repo: TripsRepo
    ) = TripsUseCase(
        getTrips = GetTrips(repo),
        addTrip = AddTrip(repo),
        chickList = AddChickList(repo),
        places = AddPlaces(repo),
        deleteTrip = DeleteTrip(repo),
        updatePhoto = UpdatePhoto(repo),
        getTripDetails = GetTripDetails(repo),
        getTripsByCategories = GetTripsByCategories(repo),
        addPlaceVisitDate = AddPlaceVisitDate(repo),
        updatePlacePhoto = UpdatePlacePhoto(repo),
        isVisited = IsPlaceVisited(repo),
        addTripJournal = AddTripJournal(repo),
        savePublicTrips = AddPublicTrips(repo),
        getPublicTrips = GetPublicTrips(repo),
        updateTripDate = UpdateTripDate(repo),
        updateTripDays = UpdateTripDays(repo),
        updateTripName = UpdateTripName(repo),
        isTripFinished = IsTripFinished(repo)
    )

    @Provides
    fun providePostUseCase(
        repo: PostsRepo
    ) = PostUseCase(
        addPost = AddPostUseCase(repo = repo),
        getPosts = GetPostsUseCase(repo),
        likePost = LikePostUseCase(repo),
        sharePost = SharePostUseCase(repo),
        addComment = AddCommentUseCase(repo),
        deletePost = DeletePostUseCase(repo),
        getPostsByUserId = GetPostsById(repo),
        getPostDetails = GetPostDetails(repo)
    )

    @Provides
    fun provideSearchPlacesRepo(api: TripApi): SearchResultRepo {
        return SearchPlacesRepoImpl(api)
    }

    @Provides
    fun provideSearchPlacesUseCase(repo: SearchResultRepo): SearchPlacesUseCase {
        return SearchPlacesUseCase(repo)
    }

    @Provides
    fun provideDetailsUseCase(repo: DetailsRepository): DetailsUseCase {
        return DetailsUseCase(repo)
    }

    @Provides
    fun provideDetailsRepository(api: TripApi, context: Context): DetailsRepository {
        return DetailsRepoImplementation(api, context)
    }

    @Provides
    fun providePhotosUseCase(repo: PhotoRepository): PhotoUseCase {
        return PhotoUseCase(repo)
    }

    @Provides
    fun providePhotosRepository(api: TripApi): PhotoRepository {
        return com.mobilebreakero.details_data.repoimpl.PhotoRepoImplementation(api)
    }

    @Provides
    fun provideRecomendationUseCase(repo: RecommendedTrips): RecommendedUseCase {
        return RecommendedUseCase(repo)
    }


    @Provides
    fun provideRecomendationPlacesUseCase(repo: RecommendedTrips): RecommendedPlaceUseCase {
        return RecommendedPlaceUseCase(repo)
    }

    @Provides
    fun provideGetPublicTrips(repo: RecommendedTrips): GetPublicTripsUseCase {
        return GetPublicTripsUseCase(repo)
    }

    @Provides
    fun provideRecomdedRepo(context: Context): RecommendedTrips {
        return RecommededImple(context)
    }

    @Provides
    fun provideContext(@ApplicationContext context: Context): Context {
        return context
    }

    @Provides
    fun provideUpdateDatePUseCase(repo: RecommendedTrips): UpdatePublicTripDate {
        return UpdatePublicTripDate(repo)
    }

    @Provides
    fun provideGetReviewsUseCase(repo: DetailsRepository): GetReviewsUseCase {
        return GetReviewsUseCase(repo)
    }

    @Provides
    fun provideUpdateDaysPUseCase(repo: RecommendedTrips): UpdatePublicTripDays {
        return UpdatePublicTripDays(repo)
    }
}