class A(var var1:Int, var var2:Int, private var var3:Int){
    fun sum(): Int{
        return var1+var2+var3
    }
}

fun A.multiply():Int{ // Creo funcion de extensión para la clase A
    return this.var1 * this.var2
}

// Tambien se pueden crear funciones de extensión para tipos basicos

fun Int.isPair():Boolean{
    return this % 2 ==0
}

fun Int.isPositive():Boolean{
    return this >=0
}

fun String.upperCaseFirsLetter():String{
    return if(this.count()>0) this.substring(0,1).toUpperCase().plus(this.substring(1)) else return ""
}

fun main(args: Array<String>){
    var objectA= A(1,2,3)
    println("Suma: "+objectA.sum())
    println("")
    println("--- Extension de A ---")
    println("Multiply: "+objectA.multiply())
    println("")
    println("--- Extension de Int ---")
    var number1=10
    var number2=-10
    var number3=3

    /*Puedo llamar directamente a las funciones declaradas */
    println("¿Es par? "+number1.isPair())
    println("¿Es positivo? "+number2.isPositive())
    println("¿Es positivo? "+number3.isPositive())
    var text="hola"
    println("Mayuscula: "+text.upperCaseFirsLetter())
    println("Mayuscula: "+"adios".upperCaseFirsLetter())
}