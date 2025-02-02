package com.mobilebreakero.profile_ui.account.accountacess.updateusername

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.mobilebreakero.navigation_core.NavigationRoutes
import com.mobilebreakero.auth_domain.util.Response
import com.mobilebreakero.auth_domain.util.Utils
import com.mobilebreakero.profile.account.accountacess.components.UpdateContent


@Composable
fun ChooseNewUserName(
    navController: NavController,
    viewModel: UpdateUserNameViewModel = hiltViewModel()
) {

    val userId = Firebase.auth.currentUser?.uid

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        UpdateContent(
            navController = navController,
            headerText = "Choose new username",
            header2 = "New Username",
            textField = "type a new username",
            buttonText = "Update username",
            cancelText = "return to settings",
            cancelNav = com.mobilebreakero.navigation_core.NavigationRoutes.ACCOUNT_ACCESS_SETTINGS,
            onClick = { username ->
                if (userId != null) {
                    viewModel.updateUserName(
                        userId, username
                    )
                }
            }
        )
        UpdateUser(navController = navController)
    }
}


@Composable
fun UpdateUser(
    viewModel: UpdateUserNameViewModel = hiltViewModel(),
    navController: NavController
) {

    val context = LocalContext.current
    when (val updateEmail = viewModel.updateUserNameResponse) {
        is Response.Loading -> com.mobilebreakero.core_ui.components.LoadingIndicator()
        is Response.Success -> {
            val isEmailUpdated = updateEmail.data
            LaunchedEffect(isEmailUpdated) {
                if (isEmailUpdated) {
                    Utils.showMessage(context, "UserName updated successfully")
                    navController.navigate(com.mobilebreakero.navigation_core.NavigationRoutes.PROFILE_SCREEN)
                }
            }
        }

        is Response.Failure -> updateEmail.apply {
            LaunchedEffect(e) {
                Utils.print(e)
            }
        }

        else -> {

        }
    }
}