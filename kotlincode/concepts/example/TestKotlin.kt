package kotlincode.concepts.example

import javax.print.DocFlavor.STRING

fun main(){
    val list= mutableListOf<String>("Mango","Banana","Apple","Guava","Cheery")

    println(list.filter { it.contains('A') })
    println(list.filter { it.length>2 })
    println(list.filter { it.length==2 })
}

//fun main(){
//    var input:Any=2.0f
//
//    when(input){
//        is Int -> println("It is an Integer")
//        is Float-> println("It is a Float")
//        is Char -> println("It is a Character")
//        is String -> println("It is a String")
//        else -> println("Invalid type")
//    }
//}


//fun main(){
////    add(2,3)
////    var x=4
////    var y:Int =5
////
////    var p1=Person("Suraj",4)
////    p1.doSomething()
//
//
//}

//fun add(num1:Int,num2:Int):Int{
//    return {num1+num2}
//}

//class Person(var name:String ,var id:Int){
//    var myName=name
//    var myId=id
//    fun doSomething(){
//        println("${myName} and ${myId}")
//    }
//}

//fun main(){
////    var n1=4
////    var n2=5
////
////    println(if (n1>n2) "$n1 is greater and" else "$n2 is greater")
////
////    var myArray: Array<String> = arrayOf("Mango","Apple","Banana")
////
////    for(item in myArray){
////        println(item)
////    }
//
//}

//fun main(){
//    case(22)
//}
//fun case(num:Int){
//        when(num){
//            in 1..10 -> println("Number is between 1 to 10")
//            in 10..20 -> println("Number is between 10 to 20")
//            in 20..30 -> println("Number is between 20 to 30")
//            else -> "Enter correct number"
//        }
//}

//fun main(){
//    var l = arrayOf("a","b","c","d","e","f")
//    var temp:String
//    println("Before Sorting")
//    for (items in l){
//        print(items)
//    }
//    println()
//    for (i in l){
//
//        for (j in l.reversed()){
//            while (i>j){
//                temp=i[]
//                i=j
//                j=temp
//            }
//
//        }
//    }
//    println("After Sorting")
//    for (items in l){
//        print(items)
//    }
//
//}

//fun main(){
//    var name:String="abcd"
//    var arr:CharArray=name.toCharArray()
//    var temp=""
//    for(i in arr.size-1 downTo 0){
//        temp=temp+arr[i]
//    }
//    println(temp)
//}