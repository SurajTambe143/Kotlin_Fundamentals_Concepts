package kotlincode.concepts.nullexample

class Wolf {

    var hunger : Int?= 10
    val food = "Meat"

    fun eat(){
        println("Wolf is eating")
    }

}

fun main(){

    var wolf :Wolf? = Wolf()
    var x=wolf?.hunger
    println("Value of x is $x")

    var y= wolf?.hunger?: -1
    println("Value of y is $y")

    var myArray = arrayOf("Suraj","Anush","Deepak",null)
    for (item in myArray){
        item?.let {
            println(it)  //it is refering to myArray
        }
    }
    getAlphaWolf()?.let{it.eat()}



    wolf?.hunger=null
    var z = wolf!!.hunger!!.hashCode()

//    wolf = null
//    var z = wolf!!.hunger

    println(z)

}