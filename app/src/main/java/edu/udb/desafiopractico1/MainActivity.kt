package edu.udb.desafiopractico1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnPromedio = findViewById<Button>(R.id.btnPromedio)
        val btnDescuentos = findViewById<Button>(R.id.btnDescuentos)
        val btnCalculadora = findViewById<Button>(R.id.btnCalculadora)

        btnPromedio.setOnClickListener{
            val intent = Intent(this, PromedioActivity::class.java)
            startActivity(intent)
        }

        btnDescuentos.setOnClickListener{
            val intent = Intent(this, DescuentosActivity::class.java)
            startActivity(intent)
        }

        btnCalculadora.setOnClickListener{
            val intent = Intent(this,CalculadoraActivity::class.java)
            startActivity(intent)
        }
    }
}