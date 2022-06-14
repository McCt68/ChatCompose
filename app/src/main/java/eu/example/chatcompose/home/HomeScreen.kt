package eu.example.chatcompose.home

import androidx.compose.foundation.background
import androidx.compose.material.Surface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import eu.example.chatcompose.util.AppColors


/**
 * The authentication view which will give the user an option to choose between
 * login and register.
 */


@Composable
// fun AuthenticationView(register: () -> Unit, login: () -> Unit) {
fun AuthenticationView(/*register: () -> Unit, login: () -> Unit*/) {

		// A surface container using the 'background' color from the theme
		Surface(color = MaterialTheme.colors.background) {
			Column(
				modifier = Modifier
					.fillMaxWidth()
					.fillMaxHeight(),
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.Bottom
			) {
				Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
					Text(text = "Register")
				}
				Button(modifier = Modifier
					.fillMaxWidth(),
					onClick = { /*TODO*/ }) {
					Text(text = "Login")
				}
			}
		}

}

@Preview
@Composable
fun Buttons() {
	AuthenticationView()
}