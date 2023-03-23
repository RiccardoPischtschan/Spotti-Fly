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
                mutableListOf(
                    Beitrag(
                        R.drawable.whatsapp_image_2022_09_29_at_14_13_2,
                        20,
                        "München",
                        "319",
                        "Ein 319ner beim Duschen",
                        mutableListOf("Super", "Schön")
                    ),
                    Beitrag(
                        R.drawable.mini_flieger,
                        30,
                        "München",
                        "Cessna",
                        "Mini Flieger im V1 abgestellt",
                        mutableListOf()
                    )
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
                mutableListOf(
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

        )
    }
}
