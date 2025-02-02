package com.mobilebreakero.profile_ui.account.accountacess.updateEmail


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mobilebreakero.navigation_core.NavigationRoutes.EMAIL_SENT_SUCCESSFULY
import com.mobilebreakero.auth_domain.util.Response.Failure
import com.mobilebreakero.auth_domain.util.Response.Loading
import com.mobilebreakero.auth_domain.util.Response.Success
import com.mobilebreakero.auth_domain.util.Utils.Companion.print
import com.mobilebreakero.auth_domain.util.Utils.Companion.showMessage

@Composable
fun UpdateEmail(
    viewModel: UpdateEmailViewModel = hiltViewModel(),
    navController: NavController
) {

    val context = LocalContext.current
    when (val updateEmail = viewModel.updateEmailResponse) {
        is Loading -> com.mobilebreakero.core_ui.components.LoadingIndicator()
        is Success -> {
            val isEmailUpdated = updateEmail.data
            LaunchedEffect(isEmailUpdated) {
                if (isEmailUpdated) {
                    showMessage(context, "Email Sent Successfully")
                    navController.navigate(EMAIL_SENT_SUCCESSFULY)
                }
            }
        }

        is Failure -> updateEmail.apply {
            LaunchedEffect(e) {
                print(e)
            }
        }

        else -> {

        }
    }
}