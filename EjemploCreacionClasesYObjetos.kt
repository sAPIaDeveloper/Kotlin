open class A(var var1: String, var var2:Int){ // Creo clase A
    init{
        println("Init invocado") // Init se utiliza para la implementacion del constructor
    }
    constructor (var1:String):this(var1,0)
}

class B(var1:String ,var2:Int, var var3:String ) : A(var1,var2), MyInterface{// Creo clase B extiente de A e implementa MyInterface
    override fun foo(){
        println("Metodo foo")
    }
    fun concat(): String{
        return var1+var3
    }
    
    fun sum(number:Int = 0){
        var2= var2+number
    }
}

interface MyInterface{
    fun foo()
}

fun main(args:Array<String>){
    
    var objectA= A("Hola",1)
    var objectB= B("HolaB",1,"PruebaB")
    println(objectA.var1)
    println(objectA.var1)
    println(objectB.concat())
    println(objectB.sum(10))
    objectB.foo()
    
}