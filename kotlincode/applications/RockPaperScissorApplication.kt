package kotlincode.applications

fun main(){
    val options = arrayOf("Rock","Paper","Scissor")
    var computerResult = getComputerResult(options).toString().uppercase()
    var userResult = getUserResult(options).toString().uppercase()
    compare(computerResult,userResult)
}

fun getComputerResult(optionsTest : Array<String>): String {
    return optionsTest[(Math.random()* optionsTest.size).toInt()]
}

fun getUserResult(optionsTest: Array<String>): String {

    for (x in optionsTest) print(" $x")
    println()
    println("Enter your choice from above")
    var input= readLine().toString()

    return input
}

fun compare(computerValue: String, userValue:String){

    val result :String

    if (computerValue==userValue) result ="Tie"
    else if ((userValue=="Rock"&&computerValue=="Scissor")||
        (userValue=="Paper"&&computerValue=="Rock")||
        (userValue=="Scissor"&&computerValue=="Rock")) result="You Won"
    else
        result="You Loose"

    println("You Choose $userValue and computer choose $computerValue so $result")
}