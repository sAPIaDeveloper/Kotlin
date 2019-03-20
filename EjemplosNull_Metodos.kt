// Ejercicio para practicar con los null y sus metodos
class A(var var1: String?, var var2: String)

fun main(args:Array<String>){
    var objectA= A(null,"Test")
    
    //objectA.var2= null No permite null ya que no tiene ? al indicar el tipo
	
    println("Count var1: "+objectA.var1?.count())// count se ejecutara si var1 es distinto de null
    objectA.var1="Hola"
    println("Count var1: "+objectA.var1?.count())
    objectA.var1= null
    println("Count var1 elvis: "+(objectA.var1?.count() ?:0))// Si var1 es distinto de nul pinta count si no el 0
	//println("Count: "+objectA.var1!!.count()) Puede probocar Exception
	
    var objectB: A?=null
    
    objectB?.var1?.let{
        println("Se ha ejecutado el let")
    }
    
    objectB= A("ObjectoB","Var2")
    objectB.var1.let{println("Se ha ejecutado despues de asignarle un valor al objectoB")}

	var objectC: A?=A("ObjectC","var2")
    objectC?.var1?.let{println("ObjectC")}
    
    objectC=null