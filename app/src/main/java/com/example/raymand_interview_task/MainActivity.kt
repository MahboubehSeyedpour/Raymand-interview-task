package com.example.raymand_interview_task

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.raymand_interview_task.presentation.navigation.Routes
import com.example.raymand_interview_task.presentation.screen.details.DetailsScreen
import com.example.raymand_interview_task.presentation.screen.home.HomeScreen
import com.example.raymand_interview_task.ui.theme.RaymandinterviewtaskTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), NavController.OnDestinationChangedListener {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()
            navController.addOnDestinationChangedListener(this)

            RaymandinterviewtaskTheme {

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(id = R.dimen.app_padding)),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RaymandApp(viewModel = viewModel, navController = navController)
                }
            }
        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
    }
}

@Composable
fun RaymandApp(viewModel: MainViewModel, navController: NavHostController) {

    Scaffold() { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Routes.Home.route,
        ) {
            composable(route = Routes.Home.route) {
                HomeScreen(navController = navController)
            }
            composable(
                route = "${Routes.Details.route}?id={id}",
                arguments = listOf(navArgument("id") {
                    type = NavType.StringType
                    defaultValue = ""
                })
            ) {
                DetailsScreen(navController = navController)
            }
        }
    }
}