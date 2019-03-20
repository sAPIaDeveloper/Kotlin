fun main(args: Array<String>){
    val listaDeEnterosConNulos: List<Int?> = listOf(0,1,2,null,3)
    for (number in listaDeEnterosConNulos){ // Similar al for each de java. En cada iteración guardo el elemento de la lista en number
        number?.let{
            print(it)
        }?: println("null")
    }
    println()
    println("---- in ----")
    
    for (number in 1..10){ // For con un rango establecido, incluye el 10
        if(number!=10) print(number) else print(number%10)
    }
    println()
    println("---- until ----")
    
    for (number in 1 until 10){ // For con un rango establecido, no incluye el 10
        print(number)
    }
    
    var count=10
    println()
    while (count>0){ // Mismo funcionamiento que en java
        print(count)
        count--
    }
}