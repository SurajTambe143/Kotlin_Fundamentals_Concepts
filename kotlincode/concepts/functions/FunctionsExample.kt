package kotlincode.concepts.functions

fun main(){

    var result = sum(2,4)
    println("predefined Sum is $result")

    println("Enter two numbers")
    var n1 = readLine()!!.toInt()
    var n2 = readLine()!!.toInt()
    println("Sum of $n1 and $n2 is ${sum(n1,n2)}")
}

fun sum(num1 : Int ,num2 : Int): Int{
    val sum=num1*num2;
    return sum
}