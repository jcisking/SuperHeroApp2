package com.example.superheroapp2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp2.model.Hero
import com.example.superheroapp2.ui.theme.SuperHeroApp2Theme





@Composable
fun HeroList(
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        this.items(Hero.heroes) { hero ->
            HeroListItem(hero)
        }
    }
}





@Composable
fun HeroListItem(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier
            .padding(16.dp)
            .height(72.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = stringResource(id = hero.name),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = stringResource(id = hero.description),
                    style = MaterialTheme.typography.bodyLarge,
//                    modifier = Modifier.width(200.dp)
                )
            }
//            Spacer(modifier = Modifier.weight(1f))
            Box() {
                Image(
                    painter = painterResource(id = hero.image),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp)
                        .size(72.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeroListItemPreview() {
    SuperHeroApp2Theme {
        HeroListItem(Hero.heroes[0])
    }
}