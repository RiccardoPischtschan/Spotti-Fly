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
                mutableListOf(),
                mutableListOf(
                    Beitrag(
                        1,
                        R.drawable.ac_2,
                        20,
                        "München",
                        "319",
                        "Ein 319ner beim Duschen. #Enteisung #319",
                        mutableListOf()
                    ),
                    Beitrag(
                        2,
                        R.drawable.ac_3,
                        30,
                        "München",
                        "Cessna",
                        "Mini Flieger im V1 abgestellt",
                        mutableListOf()
                    ),
                    Beitrag(
                        8,
                        R.drawable.ac_8,
                        312,
                        "München",
                        "Doppeldecker",
                        "Mini Flieger im V1 abgestellt. #Doppeldecker #MUC",
                        mutableListOf()
                    ),
                    Beitrag(
                        9,
                        R.drawable.ac_9,
                        30,
                        "München",
                        "340-600",
                        "Mein Feierabend Flieger. Noch schnell den 340 gepusht. ;) #MUC #340-600 #Airbus",
                        mutableListOf()
                    ),
                    Beitrag(
                        10,
                        R.drawable.ac_10,
                        411,
                        "München",
                        "787-Dreamliner",
                        "Der Dreamliner von Etihad mit sonderlackierung. #Etihad #Dreamliner",
                        mutableListOf()
                    ),
                    Beitrag(
                        11,
                        R.drawable.ac_11,
                        45,
                        "München",
                        "787-Dreamliner",
                        "Air Canada Dreamliner aus dem Enteiser Fotografiert. #Dreamliner #AirCanada #MUC",
                        mutableListOf()
                    ),
                    Beitrag(
                        12,
                        R.drawable.ac_12,
                        396,
                        "München",
                        "CRJ-700",
                        "Die CRJ abholen vom Tribwerkstestaus der Lärmschutzhalle. #CRJ #München #Aircraft",
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
                mutableListOf(),
                mutableListOf(
                    Beitrag(
                        3,
                        R.drawable.ac_1,
                        50,
                        "Madrid",
                        "747",
                        "Das ist eine 747 in freier Wildbahn. :) #747 #Madid #MAD",
                        mutableListOf()
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
                mutableListOf(),
                mutableListOf(
                    Beitrag(
                        4,
                        R.drawable.ac_4,
                        345,
                        "London",
                        "787-300",
                        "Ne 787 mit Star Wars Lackierung. #StarWars #LHR",
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
                mutableListOf(),
                mutableListOf(
                    Beitrag(
                        5,
                        R.drawable.ac_5,
                        264,
                        "Frankfurt",
                        "380",
                        "Lufthansa 380 auf den weg zur Rollbahn.",
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
                mutableListOf(),
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
            ),
            User(
                6,
                "Carla",
                "carla@gmail.com",
                "carla 187",
                R.drawable.carla,
                187,
                mutableListOf(),
                mutableListOf(
                    Beitrag(
                        7,
                        R.drawable.ac_7,
                        834,
                        "Dubai",
                        "380",
                        "Ich bin in Dubai angekommen. #380 #Airport #Dubai",
                        mutableListOf()
                    )
                )
            )
        ).shuffled()
    }
}
