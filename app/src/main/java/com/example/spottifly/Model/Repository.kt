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
                R.drawable.account_profil_image,
                50,
                mutableListOf(""),
                3,
                Beitrag(
                    R.drawable.whatsapp_image_2022_09_29_at_13_46_1,
                    20,
                    "München",
                    "747",
                    "Das ist eine 747 in freier Wildbahn",
                    mutableListOf("Super", "Schön")
                )

            )

        )
    }
}
