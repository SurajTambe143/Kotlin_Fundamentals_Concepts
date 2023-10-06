package kotlincode.concepts.lambdaexamples

import java.util.Scanner


typealias DoubleConversion=(Double)->Double
fun main(){

    var sc=Scanner(System.`in`)
    println("Enter Euro ")
    var e=sc.nextDouble()
    println("Enter USD ")
    var u=sc.nextDouble()
    var euroToUsd:DoubleConversion={x:Double->1.09*e}
    var usdToInr:DoubleConversion={x:Double->82.73*u}
    println("Euro $e to Usd is ${euroToUsd(3.0)}")
    println("USD $e to INR is ${usdToInr(2.1)}")
    var result=compare(euroToUsd,usdToInr)
    println("Inr Amount of $e Euro is ${result(e)}")

}

fun compare(lambda1:DoubleConversion,lambda2:DoubleConversion):DoubleConversion{
    return {x:Double->lambda1(lambda2(x))}
}
