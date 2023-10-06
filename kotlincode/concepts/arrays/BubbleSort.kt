package kotlincode.concepts.arrays

fun main(){
    var myArray = arrayOf(6,2,4,1,5,3)
    var temp: Int
    println("Before Sorting")
    for (items in myArray){
        print(items)
    }
    println()
    for (i in myArray){
        for (j in 0..(myArray.size-2)){
            if (myArray[j]>myArray[j+1]) {
                temp = myArray[j]
                myArray[j] = myArray[j + 1]
                myArray[j + 1] = temp
            }
        }
    }
    println("After Sorting")
    for (items in myArray){
        print(items)
    }

}