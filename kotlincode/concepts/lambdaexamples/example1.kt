package kotlincode.concepts.lambdaexamples

fun main(){

    val sum={x:Int ,y:Int-> x+y}
    val addFive={x:Int->x+5}
    val display={x:Int->"Display value is $x"}

    println("Sum is ${sum(2,5)} and Add five is ${addFive(2)} and ${display(5)}")

  var lam={x:Double->x*1.8+32}

    println(lam(20.0))
    //Lambda passing in the functions
    convert(20.0){x:Double->x*1.8+32}
}

fun convert(x:Double,converter:(Double)->Double):Double{
    val result=converter(x)
    println("Converted value of $x is $result")
    return result
}
