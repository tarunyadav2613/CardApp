package com.example.cardapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardapp.ui.theme.CardappTheme

@Preview
@Composable
fun blogprev() {
   LazyColumn (content = {
       items(getcategorydata()){item->

           blogcard(img = item.img, title =item.title , subtitle =item.subtitle)
       }

   })



}


@Composable
fun blogcard(img: Int, title: String, subtitle: String) {

    Card(
        elevation = CardDefaults.elevatedCardElevation(20.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(9.dp)

//            background(Color.Black),

//            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "sample",
                modifier = Modifier
                    .padding(8.dp)
                    .size(68.dp)
                    .weight(0.2f)


            )
//            Spacer(modifier = Modifier.height(100.dp))
            itemDescription(title, subtitle, modifier = Modifier.weight(0.8f))

        }


    }


}

@Composable
fun itemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,

            style = MaterialTheme.typography.headlineMedium,

            )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Light
//

        )
    }
}


data class Category(val img: Int, val title: String, val subtitle: String)

fun getcategorydata(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "AI/ML", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "PYTHON", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "KOTLIN", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "C++", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "JAVA", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "DART", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "WEB", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "AI/ML", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "PYTHON", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "KOTLIN", subtitle = "Language"))
    list.add(Category(R.drawable.ic_launcher_foreground, "C++", subtitle = "Language"))
    return list
}