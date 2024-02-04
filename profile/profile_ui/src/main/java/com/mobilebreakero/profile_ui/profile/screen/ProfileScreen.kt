package com.mobilebreakero.profile.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.mobilebreakero.profile_ui.component.ProfileSection


@Composable
fun ProfileScreen(navController: NavController) {
    Column {
        com.mobilebreakero.profile_ui.component.ProfileSection(navController = navController)
    }
}
