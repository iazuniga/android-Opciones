# android-Opciones
Ejemplo Opciones de selección básico, una segunda "ventanas" atiende la opción solicitada, Android con Kotlin. Modificado con fines didácticos. Original:https://youtu.be/j4j_jN-Bp7U y https://youtu.be/Ql2JlSQJD28
> UI compuesta de 2 activity, entre las cuales se puede ir de una o la otra y viseversa, pasando información (nombre y opción) de una a otra, la segunda atiemnde la opción seleccionada.


* En Activity2kt, se muestra el código principal para "ir atras" entre las activity y recuperación de la información intercambiada entre las 2 activity: 
```
        val btnBack:Button=findViewById(R.id.btnBack)
        btnBack.setOnClickListener { onBackPressed() }
        ...
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        //tvGreeting.text = "Hi $name"
        val tvGreeting: TextView =findViewById(R.id.tvGreeting)
        tvGreeting.text = "Hi $name"
```

