package com.mobilebreakero.core_domain.util

import com.mobilebreakero.core_domain.model.AppUser
import com.mobilebreakero.domain.BuildConfig


object DataUtils {

    var user: AppUser? = null

    const val API_KEY = BuildConfig.TRIP_API_KEY

    const val TRIP_API_KEY = BuildConfig.TRIP_API_KEY
    const val BASE_URL = "https://api.content.tripadvisor.com/api/v1/"

}