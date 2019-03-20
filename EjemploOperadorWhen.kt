open class A(var var1:String)
class B(var1: String, var var2:String): A(var1)
class C(var1: String, var var3:String): A(var1)
class D(var1: String, var var4:String): A(var1)

enum class Paises(var code: String, var fullName:String) { // Creo un enum con paises
    SPAIN("ES", "España"),
    GERMANY("DE","Alemania"),
    JAPAN("JP","Japón")
}

fun main(args:Array<String>){
    println("--- Ooperador when ---")
    println(getText(B("Test2","Test var 2")))
    println(getText(C("Test2","Test var 3")))
    println(getText(D("Test2","Test var 4")))
    println(getText("No soy un objeto valido"))
    
    val spain= Paises.SPAIN
    val japan= Paises.JAPAN
    println(spain.fullName+" esta en Europa? "+ isEuropean(spain))
    println(japan.fullName+" esta en Europa? "+ isEuropean(spain))
}
/*
    Al crear metodos se pone el when sobre el valor a comprobar
*/
fun getText(value : Any) = when(value){
    is B -> value.var2 // Si el valor que se pasa es de tipo B devuelve variable2
    is C -> value.var3 // Si el valor que se pasa es de tipo C devuelve variable2
    else -> "Error" // Si el valor que se pasa no es de tipo B o C devuelve mensaje de error
}

fun isEuropean(country: Paises) = when(country){
    Paises.SPAIN, Paises.GERMANY -> "Si" // Si el pais pasado por parametro es SPAIN o GERMANY devuelve si
    else -> "No" // si no es europeo devuelve No
}