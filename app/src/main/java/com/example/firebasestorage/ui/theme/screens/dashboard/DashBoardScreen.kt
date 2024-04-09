package com.example.firebasestorage.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.Purple2
import com.example.firebasestorage.ui.theme.gold

@Composable
fun DashBoardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
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

        Column(modifier = Modifier.padding(40.dp)) {
            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp), backgroundColor = gold) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                                )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }



            }
            //end of row

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }

                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp,height = 120.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon), contentDescription = "", modifier = Modifier
                                .size(50.dp)
                            )



                        }
                        Text(text = "Clothing", fontSize = 20.sp,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

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