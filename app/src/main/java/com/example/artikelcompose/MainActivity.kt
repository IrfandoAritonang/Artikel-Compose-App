package com.example.artikelcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artikelcompose.ui.theme.ArtikelComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtikelComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleImage(stringResource(R.string.title_1), stringResource(R.string.text1), stringResource(R.string.text2))
                }
            }
        }
    }
}

//pertama
@Composable
fun ArticleText(title: String, text1 : String, text2 : String, modifier: Modifier = Modifier) {
    Column{
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = text1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

//ketiga
@Composable
fun ArticleImage(title: String, text1: String, text2 : String) {
    /*cara memanggil gambar*/
    //Step nextcreate a box to overlap image and texts
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        ArticleText(
            title = title,
            text1 = text1,
            text2 = text2,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)

        )
    }
}

//kedua
@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ArtikelComposeTheme {
        //Greeting("Android")
        ArticleImage(stringResource(R.string.title_1), stringResource(R.string.text1), stringResource(R.string.text2))
    }
}