package com.example.firebasestorage.ui.theme.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.ui.theme.Purple22

@Composable
fun SignupScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.d), contentScale = ContentScale.FillBounds), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Register here", fontSize = 40.sp
        )

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var username by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current




        OutlinedTextField(value = email , onValueChange = {email=it}, placeholder = { Text(text = "enter email")})

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = password , onValueChange = {password=it}, placeholder = { Text(text = "enter password")})

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = username , onValueChange = {username=it}, placeholder = { Text(text = "enter username")})

        Button(onClick = {
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.signup(email.text.trim(),password.text.trim())

        }) {
            Text(text = "Signup")
        }

        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        }) {
            Text(text = "Have account? Login")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}