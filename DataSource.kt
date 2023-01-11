package com.example.surprise_eggs.data

import com.example.surprise_eggs.data.Model.Hippos
import com.example.surprise_eggs.R

class DataSource {

    fun getHippos (): List<Hippos>{
        return listOf(

            Hippos(
                "Emil Erbsenzähler",
                1.5,
                3.1,
                R.drawable.hippo1
            ),
            Hippos(
                "Klara Klatschmaul",
                1.4,
                2.9,
                R.drawable.hippo2
            ),
            Hippos(
                "Babsi Baby",
                1.7,
                2.8,
                R.drawable.hippo4,
            ),
            Hippos(
                "Susi Sonnenschein",
                1.6,
                3.1,
                R.drawable.hippo5,
            ),
            Hippos(
                "Guido Geistesblitz",
                1.5,
                2.9,
                R.drawable.hippo6,
            ),
            Hippos(
                "Pauly Pünklich",
                1.7,
                2.7,
                R.drawable.hippo7,
            ),
            Hippos(
                "Träumler Tommy",
                1.5,
                2.5,
                R.drawable.hippo9,
            ),
            Hippos(
                "Happy-Hippo Boss",
                1.9,
                3.1,
                R.drawable.hippo10,
            )

            )
    }
}