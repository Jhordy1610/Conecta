package pe.edu.ulima.pm.conecta.presentation.screens.main

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import pe.edu.ulima.pm.conecta.presentation.screens.main.components.DrawerMenu
import pe.edu.ulima.pm.conecta.presentation.screens.main.components.GraphNav
import pe.edu.ulima.pm.conecta.presentation.screens.main.components.TopBar

@Composable
fun MainScreen(email : String?) {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val title = remember {
        mutableStateOf("Docentes")
    }

    val AbrirDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }

    val CerrarDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.close()
        }
    }

    val changeTitle: (String) -> Unit = { newTitle ->
        title.value = newTitle
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                title = title.value,
                openDrawer = AbrirDrawer
            )
        },
        drawerContent = {
            DrawerMenu(
                email = email,
                onCloseDrawer = CerrarDrawer,
                onChangeTitle = changeTitle,
                navController = navController
            )
        }
    ) {
        GraphNav(
            email = email,
            navController = navController,
        )
    }

}

