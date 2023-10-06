package kotlincode.concepts.lambdaexamples

import java.util.Scanner

typealias DoubleTODouble=(Double,Double)->Double

fun main(){

    var add:DoubleTODouble={x:Double ,y:Double->x+y}
    var sub:DoubleTODouble={x:Double ,y:Double->x-y}
    var mul:DoubleTODouble={x:Double ,y:Double->x*y}
    var div:DoubleTODouble={x:Double ,y:Double->x/y}

    var sc=Scanner(System.`in`)
    println("Enter two Numbers")
    var num1=sc.nextDouble()
    var num2=sc.nextDouble()

    println("""
        Enter your choice :
        1)Add 2)Sub 3)Mul 4)Div
    """.trimIndent())

    var choice=sc.nextInt()
    when(choice){
        1->println(add(num1,num2))
        2->println(sub(num1,num2))
        3->println(mul(num1,num2))
        4->println(div(num1,num2))
        else ->"Please enter correct choice"
    }
}