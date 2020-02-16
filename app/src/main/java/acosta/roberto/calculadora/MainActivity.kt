package acosta.roberto.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uno: Button = findViewById(R.id.id1) as Button
        val dos: Button = findViewById(R.id.id2) as Button
        val tres: Button = findViewById(R.id.id3) as Button
        val cuatro: Button = findViewById(R.id.id4) as Button
        val cinco: Button = findViewById(R.id.id5) as Button
        val seis: Button = findViewById(R.id.id6) as Button
        val siete: Button = findViewById(R.id.id7) as Button
        val ocho: Button = findViewById(R.id.id8) as Button
        val nueve: Button = findViewById(R.id.id9) as Button
        val cero: Button = findViewById(R.id.id0) as Button
        val mas: Button = findViewById(R.id.mas) as Button
        val menos: Button = findViewById(R.id.menos) as Button
        val entre: Button = findViewById(R.id.diagonal) as Button
        val por: Button = findViewById(R.id.aste) as Button
        val borrar: Button = findViewById(R.id.borrar) as Button
        val result: Button = findViewById(R.id.result) as Button
        val punto: Button = findViewById(R.id.punto) as Button




        val salida: TextView = findViewById(R.id.salida) as TextView
        val entrada: TextView = findViewById(R.id.entrada) as TextView

        var contSuma  = 0
        var contResta  = 0
        var contDivision = 0
        var contMulti  = 0

        var entradita: Float = 0F
        var salidita: Float = 0F
        var resultadito: Float = 0F




        fun desbloquear(): Unit{
            mas.setEnabled(true)
            menos.setEnabled(true)
            diagonal.setEnabled(true)
            por.setEnabled(true)
        }

        fun bloquear(): Unit{

                mas.setEnabled(false)
                menos.setEnabled(false)
                diagonal.setEnabled(false)
                por.setEnabled(false)

        }

        bloquear()







        punto.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+".")
        }

        uno.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"1")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }


        }
        dos.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"2")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        tres.setOnClickListener(){

            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"3")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        cuatro.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"4")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        cinco.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"5")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        seis.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"6")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        siete.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"7")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        ocho.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"8")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        nueve.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"9")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        cero.setOnClickListener(){
            if(salida.getText().equals("0")){
                salida.setText("")
            }
            salida.setText(""+salida.getText()+"0")
            desbloquear()
            if(entrada.getText()!=""){
                bloquear()
            }
        }
        mas.setOnClickListener(){
            entradita = salida.text.toString().toFloat();
            entrada.setText(""+salida.getText()+"+")
            salida.setText("0")
            contSuma += 1
            bloquear()
        }
        menos.setOnClickListener(){
            entradita = salida.text.toString().toFloat();
            entrada.setText(""+salida.getText()+"-")
            salida.setText("0")
            contResta += 1
            bloquear()
        }
        por.setOnClickListener(){
            entradita = salida.text.toString().toFloat();
            entrada.setText(""+salida.getText()+"*")
            salida.setText("0")
            contMulti += 1
            bloquear()

        }
        entre.setOnClickListener(){
            entradita = salida.text.toString().toFloat();
            entrada.setText(""+salida.getText()+"/")
            salida.setText("0")
            contDivision += 1
            bloquear()
        }
        result.setOnClickListener(){


            if(contSuma > 0){
                salidita = salida.text.toString().toFloat()
                resultadito = entradita+salidita
                entrada.setText(""+resultadito+"")
                salida.setText("")
                contSuma = 0
            }
            if(contResta > 0){
                salidita = salida.text.toString().toFloat()
                resultadito = entradita-salidita
                entrada.setText(""+resultadito+"")
                salida.setText("")
                contResta = 0
            }
            if(contDivision > 0){
                salidita = salida.text.toString().toFloat()
                resultadito = entradita/salidita
                entrada.setText(""+resultadito+"")
                salida.setText("")
                contDivision = 0
            }
            if(contMulti > 0){
                salidita = salida.text.toString().toFloat()
                resultadito = entradita*salidita
                entrada.setText(""+resultadito+"")
                salida.setText("")
                contSuma = 0
            }
        }
        borrar.setOnClickListener(){
            bloquear()
            salida.setText("")
            entrada.setText("")
        }
    }
}
