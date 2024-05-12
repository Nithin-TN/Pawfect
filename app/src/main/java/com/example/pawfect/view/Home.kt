package com.example.pawfect.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pawfect.component.ItemDogCard
import com.example.pawfect.component.TopBar
import com.example.pawfect.model.Dog

@Composable
fun Home(navController: NavHostController, dogList: List<Dog>) {
    LazyColumn {
        item {
            TopBar()
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(dogList) { dog ->
            ItemDogCard(
                dog,
                onItemClicked = { clickedDog ->
                    navController.navigate("details/${clickedDog.id}/${clickedDog.name}/${clickedDog.location}")
                }
            )
        }
    }
}
