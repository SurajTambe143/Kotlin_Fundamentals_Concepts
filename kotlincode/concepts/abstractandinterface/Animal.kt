package kotlincode.concepts.abstractandinterface

abstract class Animal {

    abstract val food :String
    abstract val habitat : String

    abstract fun makeNoise()
    abstract fun eat()

    open fun roam(){
        println("Animal is roaming")
    }

}