package pe.edu.ulima.pm.conecta.presentation.screens.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import pe.edu.ulima.pm.conecta.R

@Composable
fun DrawerMenu(
    email: String?,
    navController: NavController,
    onCloseDrawer: () -> Unit,
    onChangeTitle: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.csharp),
            contentDescription = "Alumno Jhordy",
            alignment = Alignment.Center,
            modifier = Modifier
                .height(200.dp)
                .padding(top = 30.dp)
        )

        if (email == "1") { //ACÁ SE DEBEN LLAMAR A UN REGISTRO DE: CÓDIGOS -> NOMBRES
            Text(
                text = "Jhordy Lopez Santos",
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(top = 10.dp),
                textAlign = TextAlign.Center
            )
        }

        Text(
            text = "Docentes",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 85.dp, bottom = 10.dp)
                .clickable {
                    navController.navigate("docentes")
                    onCloseDrawer()
                    onChangeTitle("Docentes")
                }
        )

        Divider(
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Conectados",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
                .clickable {
/*                   navController.navigate("conectados")
                    onCloseDrawer()
                    onChangeTitle("Conectados")*/
                }
        )

        Divider(
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Reservas",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
                .clickable {
/*                    navController.navigate("reservas")
                    onCloseDrawer()
                    onChangeTitle("Reservas")*/
                }
        )


    }
}