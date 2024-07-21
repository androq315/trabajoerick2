package co.edu.sena.trabajoerick.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.trabajoerick.R
import co.edu.sena.trabajoerick.components.HeadingTextComponent
import co.edu.sena.trabajoerick.components.MyTextField
import co.edu.sena.trabajoerick.components.NormalTextComponent


@Composable

fun SignUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)

    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hubo))
            HeadingTextComponent(value = stringResource(id = R.string.crear))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.nombre),
                painterResource(id = R.drawable.person_48px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.apellido),
                painterResource(id = R.drawable.person_48px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.correo),
                painterResource(id = R.drawable.mail_48px)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()

}