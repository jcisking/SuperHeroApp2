package com.example.superheroapp2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp2.ui.theme.SuperHeroApp2Theme


@Composable
fun HeroListItem(
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(),
        modifier = modifier
            .padding(16.dp)
            .height(72.dp)
    ) {
        Row(modifier = Modifier) {
            Column {
                Text(text = stringResource(id = R.string.hero1))
                Text(text = stringResource(id = R.string.description1))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.android_superhero1), contentDescription = null)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeroListItemPreview() {
    SuperHeroApp2Theme {
        HeroListItem()
    }
}