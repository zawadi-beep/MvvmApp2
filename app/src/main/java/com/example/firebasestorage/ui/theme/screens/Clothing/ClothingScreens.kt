package com.example.firebasestorage.ui.theme.screens.Clothing

import android.content.Intent
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.gold

@Composable
fun ClothingScreen(navController: NavController) {
   Column(modifier = Modifier.fillMaxSize()) {
      TopAppBar(
         title = {
            Text(
               text = "Clothing",
               fontSize = 30.sp,
               color = gold,
               modifier = Modifier.fillMaxWidth(),
               textAlign = TextAlign.Center
            )
         },
         backgroundColor = Color.Black
      )
      //end of top app bar
      Box(
         modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
         contentAlignment = Alignment.BottomStart

      ) {
         Image(
            painter = painterResource(id = R.drawable.d),
            contentDescription = "Pixel",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,

            )
         Column {
            Text(
               text = "WINTER COLLECTION",
               fontSize = 25.sp,
               color = Color.White,
               textAlign = TextAlign.Center,
               fontWeight = FontWeight.Bold,
               fontFamily = FontFamily.Monospace

               )
            Text(
               text = "Purchase Your Clothes",
               fontSize = 20.sp,
               color = Color.White,
               textAlign = TextAlign.Center,
               fontWeight = FontWeight.Bold,

               )

         }

      }
      Spacer(modifier = Modifier.height(10.dp))
      Column(
         modifier = Modifier
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
      ) {
         Row {
            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.shoes),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.1400", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }


            Column {
                     Card(
                        modifier = Modifier
                           .size(width = 160.dp, height = 200.dp)
                           .padding(start = 20.dp)
                     ) {

                        Box(
                           modifier = Modifier.fillMaxSize(),
                           contentAlignment = Alignment.Center
                        ) {
                           Image(
                              painter = painterResource(id = R.drawable.cargo),
                              contentDescription = "New York",
                              modifier = Modifier.fillMaxSize(),
                              contentScale = ContentScale.Crop
                           )

                        }

                     }
                     Spacer(modifier = Modifier.height(10.dp))
                     Row(modifier = Modifier.padding(start = 20.dp)) {
                        Column {
                           Text(text = "Buy Now", fontSize = 20.sp)
                           Text(text = "Ksh.1500", fontSize = 15.sp)
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        OutlinedButton(

                           onClick = { }

                        ) {
                           Text(text = "Buy")

                        }

                     }

                  }




         }

         //end of row
         Spacer(modifier = Modifier.height(20.dp))

         Row {
            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.skirt),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.550", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }
            


            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.coat),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.2500", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }




         }

         //end of row
         Spacer(modifier = Modifier.height(20.dp))
         Row {
            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.shoes),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.2900", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }


            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.mbag),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.800", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }




         }
         //end of row
         Spacer(modifier = Modifier.height(20.dp))

         Row {
            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.yoo),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.590", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }


            Column {
               Card(
                  modifier = Modifier
                     .size(width = 160.dp, height = 200.dp)
                     .padding(start = 20.dp)
               ) {

                  Box(
                     modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.Center
                  ) {
                     Image(
                        painter = painterResource(id = R.drawable.jewel),
                        contentDescription = "New York",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                     )

                  }

               }
               Spacer(modifier = Modifier.height(10.dp))
               Row(modifier = Modifier.padding(start = 20.dp)) {
                  Column {
                     Text(text = "Buy Now", fontSize = 20.sp)
                     Text(text = "Ksh.9950", fontSize = 15.sp)
                  }
                  Spacer(modifier = Modifier.width(10.dp))
                  OutlinedButton(

                     onClick = { }

                  ) {
                     Text(text = "Buy")

                  }

               }

            }




         }
      }
   }
}

@Preview(showBackground = true)
@Composable
fun ClothingScreenpreview(){
   ClothingScreen(rememberNavController())
}