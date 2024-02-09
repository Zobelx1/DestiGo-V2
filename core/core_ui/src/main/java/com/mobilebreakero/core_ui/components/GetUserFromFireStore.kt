package com.mobilebreakero.core_ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.mobilebreakero.core_ui.MainViewModel
import com.mobilebreakero.core_domain.model.AppUser
import com.mobilebreakero.core_domain.util.DataUtils
import com.mobilebreakero.core_domain.util.Response

@Composable
fun GetUserFromFireStore(
    viewModel: MainViewModel = hiltViewModel(),
    id: String? = "",
    user: (AppUser) -> Unit,
) {
    LaunchedEffect(viewModel) {
        if (id != null)
            viewModel.getUser(id).collect { userResponse ->
                when (userResponse) {
                    is Response.Success -> {
                        val userData = (userResponse).data
                        DataUtils.user = userData
                        user(userData)
                    }

                    is Response.Failure -> {
                        val exception = (userResponse).e
                        print(exception.message.toString())
                    }

                    Response.Loading -> {
                    }

                    else -> {}
                }
            }
    }
}