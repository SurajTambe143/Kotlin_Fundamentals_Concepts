package kotlincode.concepts.stringexample

import java.util.Scanner

fun main(){
    val sc=Scanner(System.`in`)

    try {
        do{
            println()
            println("Enter a String")
            val inputString=sc.nextLine()
            println("Choose operation on String")
            println("1) Reverse 2)Rotate 3) No of words in camelCase 4)Exit")
            print("Enter operation number:")
            val choice=sc.nextInt()
            if(choice==4) break
            when(choice){
                1-> {
                    val result= reverse(inputString)
                    println("Reverse of given String is $result")
                }
                2-> {
                    println("Want to rotate left or right:")
                    val rChoice=sc.next()
                    println("Rotate $rChoice by how much places:")
                    val rChoicePlace=sc.nextInt()
                    when(rChoice){
                        "left"-> {
                            val result= rotateLeft(inputString,rChoicePlace)
                            println("String is rotated left by$rChoicePlace : $result")
                        }
                        "right"->{
                            val result= rotateRight(inputString,rChoicePlace)
                            println("String is rotated Right by$rChoicePlace : $result")
                        }
                        else -> print("Please enter correct choice")
                    }
                }
                3->{
                    val result= camelCase(inputString)
                    println("Total number of camelCase words are $result")
                }
                else->println("Please enter correct choice")
            }
        }while (true)
    }
    catch(e: Exception){
        println("Please enter correct option")
        main()
    }

}

fun reverse(input:String):String{
    val rev:CharArray=input.toCharArray()
    var temp=""
    for (i in rev.size-1 downTo 0 ){
        temp += rev[i]
    }
    return temp
}

fun rotateLeft(input:String,rotate:Int):String{

    val ro:CharArray=input.toCharArray()
    var tempStart=""
    var tempEnd=""
    for(i in ro.indices){
        if (i>=rotate) tempStart+=ro[i]
        if (i<rotate)   tempEnd+=ro[i]
    }
    return tempStart.plus(tempEnd)
}
fun rotateRight(input:String,rotate:Int):String{

    val ro:CharArray=input.toCharArray()
    var count1=rotate
    var tempStart=""
    var tempEnd=""
    for(i in ro.size-1 downTo 0){
        while (count1>0) {
            tempStart+=ro[i]
            count1--
        }
    }
    for(i in ro.indices){
        if(i < ro.size - rotate) {
            tempEnd += ro[i]
        }
    }
    return tempStart.plus(tempEnd)
}

fun camelCase(input: String):Int{
    val cC:CharArray=input.toCharArray()
    var count=1
    for (i in cC ){
        when(i){
            in 'A'..'Z' -> count++
        }
    }
    return count
}