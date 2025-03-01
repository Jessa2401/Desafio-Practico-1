package edu.udb.desafiopractico1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PromedioActivity : AppCompatActivity() {

    private lateinit var nombre: EditText
    private lateinit var nota1: EditText
    private lateinit var nota2: EditText
    private lateinit var nota3: EditText
    private lateinit var nota4: EditText
    private lateinit var nota5: EditText
    private lateinit var calcularPromedio: Button
    private lateinit var textViewResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_promedio)

        nombre = findViewById(R.id.nombre)
        nota1 = findViewById(R.id.nota1)
        nota2 = findViewById(R.id.nota2)
        nota3 = findViewById(R.id.nota3)
        nota4 = findViewById(R.id.nota4)
        nota5 = findViewById(R.id.nota5)
        calcularPromedio = findViewById(R.id.calcularPromedio)
        textViewResult = findViewById(R.id.textViewResult)

        calcularPromedio.setOnClickListener {
            val nombreText = nombre.text.toString()
            val nota1Text = nota1.text.toString()
            val nota2Text = nota2.text.toString()
            val nota3Text = nota3.text.toString()
            val nota4Text = nota4.text.toString()
            val nota5Text = nota5.text.toString()

            if (nombreText.isEmpty() || nota1Text.isEmpty() || nota2Text.isEmpty() || nota3Text.isEmpty() || nota4Text.isEmpty() || nota5Text.isEmpty()) {
                Toast.makeText(this, "Por favor, ingresar todos los datos", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val nota1 = nota1Text.toDouble()
                val nota2 = nota2Text.toDouble()
                val nota3 = nota3Text.toDouble()
                val nota4 = nota4Text.toDouble()
                val nota5 = nota5Text.toDouble()

                if (nota1 in 0f..10f && nota2 in 0f..10f && nota3 in 0f..10f && nota4 in 0f..10f && nota5 in 0f..10f) {

                    val promedio =
                        (nota1 * 0.15 + nota2 * 0.15 + nota3 * 0.2 + nota4 * 0.25 + nota5 * 0.25)

                    if (promedio >= 6) {
                        textViewResult.text = "Nombre: $nombreText\nPromedio: $promedio\nAprobado!"
                    } else {
                        textViewResult.text =
                            "Nombre: $nombreText\nPromedio: $promedio\nReprobado :("
                    }

                } else {
                    Toast.makeText(this, "Las notas deben estar entre 0 y 10", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}