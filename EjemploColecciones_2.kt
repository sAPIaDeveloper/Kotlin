fun main(args: Array<String>){
    val ints=IntArray(10)
    for (number in ints){
        print("$number") // Es equivalente a print(number)
    }
    
    println("")
    println("---------")
    val ints2= intArrayOf(1,2,3,4)
    for (number in ints2){
        print("$number")
    }
    
    println("")
    println("---------")
    val ints3= IntArray(10,{i-> i+2}) // Especifico que tiene 10 elementos y que el primero empieza en 2
    for (number in ints3){
        print("$number")
    }
    
    println()
    println("----- Filtro ------")
    
    val list=listOf("Test 1","Test 2", "Test 3", "Test 4")
    val filterList = list.filter{ // Función donde especifico que muestre el elemento de la lista que contenga el 2
        it.contains("2")
    }
    for (number in filterList){
        print("$number")
    }
    println("")
    println("--- map ---")
    val listToApplyMap= listOf("Test 1","Test 2", "Test 3", "Test 4")
    val mapList = listToApplyMap.map{
        text -> text + "," // El map es la unica lista que se puede modificar, concateno cada String con una coma
    }
    for(number in mapList){
        print("$number")
    }
    
    println("")
    println("--- Fold ---")
    val listToApplyFold = listOf(1,-2,3,4,5)
    
    println("Fold "+ listToApplyFold.fold(2){
        count, it -> count + it //Muestra una suma de todos los numeros de la coleccion mas del especificado
    }) 
       
    println("--- Any ---")
    val listToApplyAny = listOf(1,2,3,4,5)
    println("Any: "+ listToApplyAny.any{
        it < 0 // Devuelve un boleano despendiendo de si se cumple o no la condicion
    })
    
        println("--- Count ---")
        val listToApplyCount = listOf(1,-2,3,-4,5)
        println("Count: "+ listToApplyCount.count{
            it < 0 //Muestra una suma de todos los numeros de la coleccion que cumplan la condición
        })
    
    println("--- Find ---")
    val listToApplyFind = listOf(1,-2,3,-4,5)
    println("Find: "+ listToApplyFind.find{
        it < 0 // Muestra la primera coincidencia
    })
    
    println("--- Max ---")
    val listToApplyMax = listOf(1,-2,3,-4,5)
    println("Max: "+ listToApplyMax.max()) // Muestra el maximo
    
    println("--- Min ---")
    val listToApplyMin = listOf(1,-2,3,-4,5)
    println("Max: "+ listToApplyMin.min()) // Muestra el minimo
    
    println("--- ElementAtOrNull ---")
    val listToApplyElementAtOrNull = listOf(1,-2,3,-4,5)
    println("ElementAtOrNull: "+ listToApplyElementAtOrNull.elementAtOrNull(3)) // Si indica un indice mayo en vez de saltar excepcion para ese indice te devuelve null
    
    println("--- Partition ---")
    val listToApplyPartition = listOf(1,-2,3,-4,5)
    println("Partition: "+ (listToApplyPartition.partition{
        it>0 // Divide el resultado en dos colecciones, mayores que 0 y menores. Con el '.first' obtengo la primera coleccion
    }).first)
    
    println("--- Sort ---")
    val intArrayToSort = intArrayOf(10,2,8,-4,20)
    intArrayToSort.sort() // Ordeno la coleccion
        
    for (number in intArrayToSort){
        println("$number")
    }
}