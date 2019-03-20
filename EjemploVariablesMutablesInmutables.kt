class A{
    var variable1:String
    val value:String
    var isEmpty: Boolean
    	get()=variable1.count()==0
    
    var number: Int
    	set(value){
            if(value >= 0) field = value else field = 0
        }
    
    constructor(variable1:String, value:String, number:Int){
        this.variable1=variable1
        this.value=value
        this.isEmpty=false
        this.number=number
    }
}

fun main(args:Array<String>){
    var objectA=A("Variable mutable","Variable inmutable",1)
    println(objectA.variable1)
    objectA.variable1="Hola mundo"
    println(objectA.variable1)
    //objectA.value="Adios mundo" No puede cambiar una variable val ya que es inmutable
    println(objectA.value)
    println(objectA.number)
    objectA.number=-10
    println(objectA.number)
    
    val text= "StringComoArray"
    println("Accedemos al elemento con indice 2: " + text[2])
    
    for	(item in text){
        print(item)
    }
    
    //text[2]="a" En kotlin no son reasignables un valor a un elemento del array de tipo String
}




