package mx.edu.utez.cuadradomagico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtCuadro1 = findViewById<EditText>(R.id.edtCuadro1)
        val edtCuadro2 = findViewById<EditText>(R.id.edtCuadro2)
        val edtCuadro3 = findViewById<EditText>(R.id.edtCuadro3)
        val edtCuadro4 = findViewById<EditText>(R.id.edtCuadro4)
        val edtCuadro5 = findViewById<EditText>(R.id.edtCuadro5)
        val edtCuadro6 = findViewById<EditText>(R.id.edtCuadro6)
        val edtCuadro7 = findViewById<EditText>(R.id.edtCuadro7)
        val edtCuadro8 = findViewById<EditText>(R.id.edtCuadro8)
        val edtCuadro9 = findViewById<EditText>(R.id.edtCuadro9)

        val txtResultadoFila1 = findViewById<TextView>(R.id.txtResultadoFila1)
        val txtResultadoFila2 = findViewById<TextView>(R.id.txtResultadoFila2)
        val txtResultadoFila3 = findViewById<TextView>(R.id.txtResultadoFila3)

        val txtResultadoColumna1 = findViewById<TextView>(R.id.txtResultadoColumna1)
        val txtResultadoColumna2 = findViewById<TextView>(R.id.txtResultadoColumna2)
        val txtResultadoColumna3 = findViewById<TextView>(R.id.txtResultadoColumna3)

        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        val txtDialogo = findViewById<TextView>(R.id.txtDialogo)

        btnCalcular.setOnClickListener {
            var validar1 = edtCuadro1.text.toString()
            var validar2 = edtCuadro2.text.toString()
            var validar3 = edtCuadro3.text.toString()
            var validar4 = edtCuadro4.text.toString()
            var validar5 = edtCuadro5.text.toString()
            var validar6 = edtCuadro6.text.toString()
            var validar7 = edtCuadro7.text.toString()
            var validar8 = edtCuadro8.text.toString()
            var validar9 = edtCuadro9.text.toString()

            if (validar1 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 1"

            }else if (validar2 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 2"

            }else if (validar3 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 3"

            }else if (validar4 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 4"

            }else if (validar5 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 5"

            }else if (validar6 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 6"

            }else if (validar7 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 7"

            }else if (validar8 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 8"

            }else if (validar9 == "") {
                txtDialogo.text = "No has ingresado nada en el cuadro 9"

            }else {
                var valor1 = validar1.toInt()
                var valor2 = validar2.toInt()
                var valor3 = validar3.toInt()
                var valor4 = validar4.toInt()
                var valor5 = validar5.toInt()
                var valor6 = validar6.toInt()
                var valor7 = validar7.toInt()
                var valor8 = validar8.toInt()
                var valor9 = validar9.toInt()

                var resultadoFila1 = valor1 + valor2 + valor3
                var resultadoFila2 = valor4 + valor5 + valor6
                var resultadoFila3 = valor7 + valor8 + valor9

                var resultadoColumna1 = valor1 + valor4 + valor7
                var resultadoColumna2 = valor2 + valor5 + valor8
                var resultadoColumna3 = valor3 + valor6 + valor9

                txtResultadoFila1.text = resultadoFila1.toString()
                txtResultadoFila2.text = resultadoFila2.toString()
                txtResultadoFila3.text = resultadoFila3.toString()

                txtResultadoColumna1.text = resultadoColumna1.toString()
                txtResultadoColumna2.text = resultadoColumna2.toString()
                txtResultadoColumna3.text = resultadoColumna3.toString()

                if (resultadoFila1 == resultadoFila2 && resultadoFila1 == resultadoFila3 && resultadoFila1 == resultadoColumna1 && resultadoFila1 == resultadoColumna2 && resultadoFila1 == resultadoColumna3) {
                    txtDialogo.text = "Felicidades!!"

                }else {
                    txtDialogo.text = "Los resultado no son iguales"

                }
            }
        }

        btnLimpiar.setOnClickListener {
            edtCuadro1.setText("")
            edtCuadro2.setText("")
            edtCuadro3.setText("")
            edtCuadro4.setText("")
            edtCuadro5.setText("")
            edtCuadro6.setText("")
            edtCuadro7.setText("")
            edtCuadro8.setText("")
            edtCuadro9.setText("")

            txtResultadoFila1.setText("")
            txtResultadoFila2.setText("")
            txtResultadoFila3.setText("")

            txtResultadoColumna1.setText("")
            txtResultadoColumna2.setText("")
            txtResultadoColumna3.setText("")

        }
    }
}