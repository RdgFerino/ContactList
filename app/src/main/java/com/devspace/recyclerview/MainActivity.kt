package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)

    }
}

val contacts = listOf(
    Contact(
        "Richard",
        "(+351) 924589652",
        R.drawable.sample10
    ),
    Contact(
        "Marcelo",
        "(+351) 952987456",
        R.drawable.sample12
    ),
    Contact(
        "Bruno",
        "(+351) 982458793",
        R.drawable.sample6
    ),
    Contact(
        "José",
        "(+351) 913258745",
        R.drawable.sample10
    ),
    Contact(
        "Júlia",
        "(+351) 935698752",
        R.drawable.sample1
    ),
    Contact(
        "Margarida",
        "(+351) 924658974",
        R.drawable.sample16
    ),
    Contact(
        "Bruna",
        "(+351) 931258963",
        R.drawable.sample15
    ),
    Contact(
        "Olívia",
        "(+351) 914587896",
        R.drawable.sample5
    ),
    Contact(
        "Júnior",
        "(+351) 927854214",
        R.drawable.sample12
    ),
    Contact(
        "Fred",
        "(+351) 928547123",
        R.drawable.sample9
    ),
    Contact(
        "Camila",
        "(+351) 924521458",
        R.drawable.sample7
    ),
    Contact(
        "Denise",
        "(+351) 924589652",
        R.drawable.sample3
    ),
    Contact(
        "Leonardo",
        "(+351) 915874569",
        R.drawable.sample2
    ),
    Contact(
        "Pedro",
        "(+351) 914589652",
        R.drawable.sample14
    ),
    Contact(
        "Márcia",
        "(+351) 924589652",
        R.drawable.sample4
    ),
    Contact(
        "Silvia",
        "(+351) 924589652",
        R.drawable.sample13
    ),
)