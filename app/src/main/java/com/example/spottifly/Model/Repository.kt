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
                        1,
                        R.drawable.ac_1,
                        20,
                        "München",
                        "319",
                        "Ein 319ner beim Duschen",
                        mutableListOf()
                    ),
                    Beitrag(
                        2,
                        R.drawable.ac_3,
                        30,
                        "Madrid",
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
                        3,
                        R.drawable.ac_2,
                        50,
                        "München",
                        "747",
                        "Das ist eine 747 in freier Wildbahn",
                        mutableListOf("Geil", "Schön")
                    )
                )
            ),
            User(
                3,
                "Sascha",
                "sascha@gmail.com",
                "7464683738",
                R.drawable.sascha,
                10,
                mutableListOf(""),
                mutableListOf(
                    Beitrag(
                        4,
                        R.drawable.ac_4,
                        345,
                        "London",
                        "787-300",
                        "Ne 787 mit Star Wars Lackierung",
                        mutableListOf()
                    )
                )
            ),
            User(
                4,
                "Flieger Karl",
                "karl@gmail.com",
                "645878997",
                R.drawable.karl,
                76,
                mutableListOf(""),
                mutableListOf(
                    Beitrag(
                        5,
                        R.drawable.ac_5,
                        264,
                        "Frankfurt",
                        "380",
                        "Lufthansa 380 auf den weg zur Rollbahn",
                        mutableListOf()
                    )
                )
            ),
            User(
                5,
                "Hanna",
                "hanna@gmail.com",
                "Hanna_ist_die_beste",
                R.drawable.hanna,
                298,
                mutableListOf(""),
                mutableListOf(
                    Beitrag(
                        6,
                        R.drawable.ac_6,
                        89,
                        "München",
                        "340-600",
                        "Mein erster 340er als Ramp Agent",
                        mutableListOf()
                    )
                )
            )
        )
    }
}
