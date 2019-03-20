class A (var number:Int, var text:String)

fun iterateWithLambda(list: List<Int>, function: (number: Int) -> Unit){ // Funcion que contiene entre parametro la llamada a otra funcion
    list.map{
        println("Test: "+it)
        function(it)
    }
}

fun executeMethodsIfNumberIsPair(number:Int , pair:() -> Unit, odd: () -> Unit){
    if(number % 2 == 0) pair() else odd()
}

fun main(args: Array<String>){
    val objectList = listOf(A(1,"Test"),
    						A(2,"Test 2"),
    						A(3,"Test 3"))
    
    val intList = listOf(1,2,3,4)
    
    println("--- Antes de la lambda ---")
    objectList.map{ current: A -> println(current.number)}
    
    //objectList.map{ println(it.number)} Es lo mismo que la expresion de arriba
    println("")
    println("--- Despues de la lambda ---")
    objectList.map{ it.number++}
    objectList.map{ println(it.number)}
    
    println("")
    println("--- Ejecutar metodo con lambda ---")
    
    var number=0
    iterateWithLambda(intList,{
        number+=it
    })
    
    println("Number: "+number)
    
    println("")
    println("--- Ejecutar metodo executeMethodsIfNumberIsPair ---")
    executeMethodsIfNumberIsPair(12,{
       println("Es par") 
    }, {
        println("No es par")
    })
}