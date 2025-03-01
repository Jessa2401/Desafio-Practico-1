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

class DescuentosActivity : AppCompatActivity() {

    private lateinit var nombre: EditText
    private lateinit var sueldobase: EditText
    private lateinit var buttonDescuento: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_descuentos)

        nombre = findViewById(R.id.nombre)
        sueldobase = findViewById(R.id.salariobase)
        buttonDescuento = findViewById(R.id.buttonDescuento)
        textViewResult = findViewById(R.id.textViewResult)

        buttonDescuento.setOnClickListener{
            val nombreText=nombre.text.toString()
            val sueldobaseText=sueldobase.text.toString()

            val sueldobase = sueldobaseText.toDouble()

            val afp = sueldobase*0.075
            val isss = sueldobase*0.03


                if (sueldobase >= 0.01 && sueldobase <= 472) {
                    val sueldoneto = sueldobase - afp - isss
                    textViewResult.text =
                        "Nombre: $nombreText\nSalario Base:$ ${String.format("%.2f",sueldobase)}\nSalario Neto:$ ${String.format("%.2f",sueldoneto)}\nDescuento de AFP:$ ${String.format("%.2f",afp)}\nDescuento ISSS:$ ${String.format("%.2f",isss)}"

                } else {

                    if (sueldobase >= 472.01 && sueldobase <= 895.24) {
                        val renta = (sueldobase - 472) * 0.1 + 17.67
                        val sueldoneto = sueldobase - renta - afp - isss
                        textViewResult.text =
                            "Nombre: $nombreText\nSalario Base:$ ${String.format("%.2f",sueldobase)}\nSalario Neto:$ ${String.format("%.2f",sueldoneto)}\nDescuento de AFP:$ ${String.format("%.2f",afp)}\nDescuento ISSS:$ ${String.format("%.2f",isss)}\nDescuento total de renta:$ ${String.format("%.2f",renta)}"

                    } else {

                        if (sueldobase >= 895.25 && sueldobase <= 2038.10) {
                            val renta = (sueldobase - 895.24) * 0.2 + 60
                            val sueldoneto = sueldobase - renta - afp - isss
                            textViewResult.text =
                                "Nombre: $nombreText\nSalario Base:$ ${String.format("%.2f",sueldobase)}\nSalario Neto:$ ${String.format("%.2f",sueldoneto)}\nDescuento de AFP:$ ${String.format("%.2f",afp)}\nDescuento ISSS:$ ${String.format("%.2f",isss)}\nDescuento total de renta:$ ${String.format("%.2f",renta)}"

                        } else {
                            if (sueldobase >= 2038.11) {
                                val renta = (sueldobase - 2038.10) * 0.3 + 288.57
                                val sueldoneto = sueldobase - renta - afp - isss
                                textViewResult.text =
                                    "Nombre: $nombreText\nSalario Base:$ ${String.format("%.2f",sueldobase)}\nSalario Neto:$ ${String.format("%.2f",sueldoneto)}\nDescuento de AFP:$ ${String.format("%.2f",afp)}\nDescuento ISSS:$ ${String.format("%.2f",isss)}\nDescuento total de renta:$ ${String.format("%.2f",renta)}"

                            }
                        }
                    }
                }
        }

    }
}