package com.iz.appcomunica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btnBack:Button =findViewById(R.id.btnBack)
        btnBack.setOnClickListener { onBackPressed() }

        getAndShowDatos()

    }

    fun getAndShowDatos() {
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        //tvGreeting.text = "Hi $name"
        val tvGreetingt: TextView = findViewById(R.id.tvGreeting)
        tvGreetingt.text = "Hi $name"

        //opc
        val opc = bundle?.get("INTENT_OPC")

        var opc2 = "$opc"
        var opcr = "_______"
        var num = opc2.toInt()

        if(num == 1){
            opcr = "A.- Integrar"
        } else if(num == 2){
            opcr = "B.- Recuperar"
        } else if(num == 3) {
            opcr = "B.- Armar"
        }

        val tvOpciont: TextView = findViewById(R.id.tvOpcion)
        tvOpciont.text = "opc: $opc2 Result: $opcr"
    }

}