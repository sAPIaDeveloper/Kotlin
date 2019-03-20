fun main(args: Array<String>){
    val number: String?="Hola"
    
    val count:Int = try{
        number!!.count()
    }catch(e: Exception){
        0
    }
    println("Count: "+count)
    
    //error() Lanzando una excepción
    
    number?.let{println(number)} ?: error() // Si no es null que muestre el valor de number si no que salte la excepción
}

fun error(): Nothing{
    throw RuntimeException() // Lanzo una excepcion que no recoge nada
}