package com.mobilebreakero.destigo.di

import com.google.firebase.firestore.FirebaseFirestore
import com.mobilebreakero.profile_data.FireStoreRepoImpl
import com.mobilebreakero.posts_data.repoimpl.PostRepoImpl
import com.mobilebreakero.posts_domain.repo.PostsRepo
import com.mobilebreakero.profile_domain.UserRepository
import com.mobilebreakero.trips_data.repoimpl.TripRepoImpl
import com.mobilebreakero.trips_domain.repo.TripsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {



    @Provides
    fun providesFireStoreRepository(): UserRepository =
        FireStoreRepoImpl()

    @Provides
    fun providePostRepo(): PostsRepo =
        PostRepoImpl()

    @Provides
    fun provideFirebaseFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }

    @Provides
    fun provideTripsRepo(): TripsRepo {
        return TripRepoImpl()
    }


}