package com.example.firebasestorage.ui.theme.screens.dashboard

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.navigation.ROUT_CLOTHING
import com.example.firebasestorage.ui.theme.Purple2
import com.example.firebasestorage.ui.theme.gold
import com.example.firebasestorage.ui.theme.screens.Clothing.ClothingScreen

@Composable
fun DashBoardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
    TopAppBar(
        title = { Text(text = "Amazon Shop", fontSize = 30.sp, color = gold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)},
        backgroundColor = Color.Black
        )



        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier.padding(start = 80.dp)){
            Column {
                Text(text = "Amazon", fontSize = 20.sp, fontWeight = FontWeight.Bold,color = gold)
                Text(text = "Shop from A to Z")
            }
            Spacer(modifier = Modifier.width(80.dp))

            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                .height(40.dp)
                .width(40.dp) )

        }

        //end of Row
        Spacer(modifier = Modifier.height(0.dp))

        Column(modifier = Modifier
            .padding(40.dp)
            .verticalScroll(rememberScrollState())) {
            Row {
                Card(modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                    }
                    .size(width = 150.dp,height = 120.dp), ) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.clothing), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                                )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Games", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.c), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Fruits", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.elect), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Electronics", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.paw), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Toys", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.car4), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Vehicles", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.jewel), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Jewellery", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.house5), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Furniture", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp), ) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.clothing), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Games", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row



        }
    }





}
@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashBoardScreen(rememberNavController())
}