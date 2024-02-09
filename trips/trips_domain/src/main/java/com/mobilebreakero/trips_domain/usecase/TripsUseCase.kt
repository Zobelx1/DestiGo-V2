package com.mobilebreakero.trips_domain.usecase

import com.mobilebreakero.trips_domain.usecase.trips.*

data class TripsUseCase(
    val addTrip: AddTrip,
    val getTrips: GetTrips,
    val chickList: AddChickList,
    val places: AddPlaces,
    val deleteTrip: DeleteTrip,
    val updatePhoto: UpdatePhoto,
    val getTripDetails: GetTripDetails,
    val getTripsByCategories: GetTripsByCategories,
    val isVisited: IsPlaceVisited,
    val updatePlacePhoto: UpdatePlacePhoto,
    val addPlaceVisitDate: AddPlaceVisitDate,
    val addTripJournal: AddTripJournal,
    val getPublicTrips: GetPublicTrips,
    val savePublicTrips: AddPublicTrips,
    val updateTripDate: UpdateTripDate,
    val updateTripDays: UpdateTripDays,
    val updateTripName: UpdateTripName,
    val isTripFinished: IsTripFinished
)