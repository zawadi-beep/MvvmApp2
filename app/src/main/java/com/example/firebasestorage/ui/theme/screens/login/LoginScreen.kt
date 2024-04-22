package com.example.firebasestorage.ui.theme.screens.login

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_DASHBOARD
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.ui.theme.Purple2

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.d), contentScale = ContentScale.FillBounds), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Login here", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, color = Color.White)

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(value = email , onValueChange = {email=it}, placeholder = { Text(text = "enter email", color = Color.White)})
Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = password , onValueChange = {password=it}, placeholder = { Text(text = "enter password", color = Color.White)})

        Button(onClick = {
            // HANDLE LOGIN LOGIC //val
            var xyz = AuthViewModel(navController, context)
            xyz.login(email.text,password.text)
            navController.navigate(ROUT_DASHBOARD)

        }) {
            Text(text = "Login")
        }

        Button(onClick = {
            navController.navigate(ROUT_SIGNUP)
        }) {
            Text(text = "No account? Signup")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}