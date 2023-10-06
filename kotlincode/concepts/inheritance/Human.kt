package kotlincode.concepts.inheritance

open class Human(){
    open val name: String =""
    open val age: Int =0
    open val gender: String =""
    open val designation: String =""

    open fun action(){
        println("This is a human class")
    }

}