package cz.pslib.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    val navController = rememberNavController()
    val currentScreen =
        navController.currentBackStackEntryAsState().value?.destination?.route ?: "postList"
    val title = when (currentScreen) {
        "postList" -> "Příspěvky"
        "notifications" -> "Upozornění"
        "imagePicker" -> "Vybrat obrázek"
        else -> "Moje aplikace"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title) }
            )
        },
        bottomBar = {
            NavigationBar(
                modifier = Modifier.shadow(elevation = 8.dp)
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Outlined.Home, contentDescription = "Domů") },
                    label = { Text("Domů") },
                    selected = currentScreen == "home",
                    onClick = { navController.navigate("home") }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Outlined.List, contentDescription = "Příspěvky") },
                    label = { Text("Příspěvky") },
                    selected = currentScreen == "postList",
                    onClick = { navController.navigate("postList") }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Outlined.Notifications, contentDescription = "Upozornění") },
                    label = { Text("Upozornění") },
                    selected = currentScreen == "notifications",
                    onClick = { navController.navigate("notifications") }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Outlined.AccountBox, contentDescription = "Foto") },
                    label = { Text("Foto") },
                    selected = currentScreen == "imagePicker",
                    onClick = { navController.navigate("imagePicker") }
                )
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            NavigationGraph(navController = navController)
        }
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "postList"
    ) {
        composable("postList") { PostListScreen(PostViewModel()) }
        composable("notifications") { NotificationScreen() }
        composable("imagePicker") { ImagePickerScreen() }
        composable("home") { LoadingScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
