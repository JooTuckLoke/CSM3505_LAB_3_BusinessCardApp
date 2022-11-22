package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    WholePage()
                }
            }
        }
    }
}

@Composable
fun Section1(name: String,role : String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ){
        val image = painterResource(id = R.drawable.android_logo)

        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )

        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp
        )

        Text(
            text = role,
            fontSize = 24.sp,
        )
        Divider(color = Color.Green, modifier = Modifier
            .width(300.dp)
            .padding(top = 50.dp, bottom = 40.dp))
    }
}

@Composable
fun Section2(phoneNo: String, address: String, email: String){
    Column() {

        Row(){
            Icon(Icons.Filled.Phone, contentDescription = null)
            Text(text = phoneNo, modifier = Modifier.padding(start = 25.dp))
        }
        Row(modifier = Modifier.padding(top = 10.dp)){
            Icon(Icons.Filled.Place, contentDescription = null)
            Text(text = address, modifier = Modifier.padding(start = 25.dp))
        }
        Row(modifier = Modifier.padding(top = 10.dp)){
            Icon(Icons.Filled.Email, contentDescription = null)
            Text(text = email, modifier = Modifier.padding(start = 25.dp))
        }
    }
}

@Composable
fun WholePage(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
        ) {
        Section1(name = "Loke Joo Tuck", role = "Front-End Developer")
        Section2(phoneNo = "+60166658031", address = "Seri Kembangan, Selangor", email = "jootuckloke@gmail.com")
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        WholePage()
    }
}