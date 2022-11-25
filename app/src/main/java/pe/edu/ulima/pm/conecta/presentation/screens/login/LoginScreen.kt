package pe.edu.ulima.pm.conecta.presentation.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(
    cambiarAMain : (email : String) -> Unit
) {

    val email = remember {
        mutableStateOf("")
    }

    val pass = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {

        Image(painter = painterResource(id = pe.edu.ulima.pm.conecta.R.drawable.logo),
            contentDescription = "Logo Conecta",
            modifier = Modifier
                .weight(0.30f)
                .fillMaxSize()
                .padding(top = 15.dp)
        )

        Text(
            text = "Conecta",
            fontSize = 18.sp,
            modifier = Modifier
                .weight(0.10f)
                .fillMaxWidth()
                .padding(top = 5.dp),
            textAlign = TextAlign.Center
        )

        Column(
            modifier = Modifier
                .weight(0.35f)
        ) {
            Text(
                text = "Hola! Un gusto volver a verte",
                fontSize = 15.sp,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 15.dp),
                textAlign = TextAlign.Start
            )
            Text(
                text = "Email",
                fontSize = 15.sp,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 15.dp),
                textAlign = TextAlign.Start
            )

            OutlinedTextField(
                value = email.value,
                onValueChange = {
                    email.value = it
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
            )

            Text(
                text = "Password",
                fontSize = 15.sp,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 15.dp),
                textAlign = TextAlign.Start
            )

            OutlinedTextField(
                value = pass.value,
                onValueChange = {
                    pass.value = it
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
            )
        }

        Button(
            onClick = {
                cambiarAMain(email.value)
            },
            modifier = Modifier
                .weight(0.25f)
                .fillMaxSize()
                .padding(top = 35.dp, bottom = 110.dp, start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Iniciar sesión")
        }

    }
}