//Ejemplo para Casting
open class A(var var1: String) //Creo la clase A
/*Creo las clase B y C que heredan de A*/
class B(var1: String, var var2:String) : A(var1)  
class C(var1: String, var var3:String) : A(var1)

fun main(args:Array<String>){
    var objectA: Any=B("Hola mundo","Test")
    
    // En la misma comprobación se hace el casteo del objeto a A y B
    if (objectA is A){
        println(objectA.var1)
    }
    
    if (objectA is B){
        println(objectA.var2)
    }
    
    if(objectA !is C){
        println((objectA as B).var2)
    }
}