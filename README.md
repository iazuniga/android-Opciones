# android-opciones
Ejemplo Opciones de selección básico, una segunda "ventanas" atiende la opción solicitada, Android con Kotlin. Modificado con fines didácticos. Original:https://youtu.be/j4j_jN-Bp7U y https://youtu.be/Ql2JlSQJD28
> UI compuesta de 2 activity, entre las cuales se puede ir de una o la otra y viseversa, pasando información (nombre y opción) de una a otra, la segunda atiemnde la opción seleccionada.


* En Activity2.kt, se muestra un código muy básico solo para ejemplificar y vislumbrar la idea del ejercicio: 
```
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
```


