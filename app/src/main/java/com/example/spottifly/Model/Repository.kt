package com.example.spottifly.Model

import com.example.spottifly.R

class Repository {
    fun userList(): List<User> {
        return listOf(
            User(
                1,
                "Manu",
                "manu@gmail.com",
                "FliegenFetzt",
                R.drawable.profilbild,
                50,
                mutableListOf(""),
                3,
                Beitrag(
                    R.drawable.whatsapp_image_2022_09_29_at_14_13_2,
                    20,
                    "München",
                    "319",
                    "Ein 319ner beim Duschen",
                    mutableListOf("Super", "Schön")
                )
            ),
            User(
                2,
                "Stefan",
                "stefan@gmail.com",
                "FetzFliege",
                R.drawable.account_profil_image,
                180,
                mutableListOf(""),
                5,
                Beitrag(
                    R.drawable.whatsapp_image_2022_09_29_at_13_46_1,
                    50,
                    "München",
                    "747",
                    "Das ist eine 747 in freier Wildbahn",
                    mutableListOf("Geil", "Schön")
                )
            )

        )
    }
}
