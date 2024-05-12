package com.example.pawfect.data

import com.example.pawfect.R
import com.example.pawfect.model.Dog
import com.example.pawfect.model.Owner

object FakeDogDatabase {
    val owner = Owner("Charlie's Animal Rescue Centre", "Pet Adoption center", R.drawable.owner)
    val dogList = listOf(
        Dog(
            0,
            "Scooby",
            3.5,
            "Male",
            "Brown",
            12.9,
            "9km away",
            R.drawable.orange_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            1,
            "Maxy",
            3.0,
            "Male",
            "Gold",
            12.4,
            "9km away",
            R.drawable.blue_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            2,
            "Rebecca",
            1.5,
            "Female",
            "White",
            9.6,
            "9km away",
            R.drawable.red_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            3,
            "Cipher",
            3.5,
            "Male",
            "Black",
            8.2,
            "9km away",
            R.drawable.yellow_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            4,
            "Billi",
            3.5,
            "Female",
            "Choco",
            14.9,
            "9km away",
            R.drawable.white_cat,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        )
    )
}
