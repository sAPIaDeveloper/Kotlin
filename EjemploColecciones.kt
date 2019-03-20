fun main(args: Array<String>){
    val list= listOf("Test1","Test2") // Creo una lista inmutable, no se puede modificar
    var mutableList=mutableListOf("Test1","Test2") // Creo una lista mutable
    
    //list.add("Test3") No permite modificar la coleccion ya que no es mutable
    
    
    list.map{
        println(it)// Itera por cada elemento de la lista
    }
    
    println()
    println("--- Antes de añadir ---")
    mutableList.map{
        println(it)
    }
    println()
    println("--- Despues de añadir ---")
    mutableList.add("Test3")
    mutableList.map{
        println(it)
    }
    
    mutableList.clear()
   
}