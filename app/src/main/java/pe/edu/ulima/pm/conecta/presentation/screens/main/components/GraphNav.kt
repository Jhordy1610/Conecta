package pe.edu.ulima.pm.conecta.presentation.screens.main.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import pe.edu.ulima.pm.conecta.presentation.screens.docentes.DocentesScreen

@Composable
fun GraphNav(
    email: String?,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "docentes"
    ) {

        composable("docentes") {
            DocentesScreen(email, navController)
        }

/*        composable("infoDocente") {
            InfoDocenteScreen {
                navController.navigate("")
            }
        }

        composable("infoCurso") {
            InfoCursoScreen {
                navController.navigate("")
            }
        }

        composable("infoPublicaciones") {
            InfoPublicacionesScreen {
                navController.navigate("")
            }
        }

        composable("infoProyectos") {
            InfoProyectosScreen {
                navController.navigate("")
            }
        }

        composable("infoAsesoriasPresencial") {
            InfoAsesoriasPresencialScreen {
                navController.navigate("")
            }
        }

        composable("infoAsesoriasVirtual") {
            InfoAsesoriasVirtualScreen {
                navController.navigate("")
            }
        }

        composable("conectados") {
            ConectadosScreen {
                navController.navigate("")
            }
        }

        composable("reservas") {
            ReservasScreen {
                navController.navigate("")
            }
        }

        composable("infoReserva") {
            infoReservaScreen {
                navController.navigate("")
            }
        }*/


    }
}












