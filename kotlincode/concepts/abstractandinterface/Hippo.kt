package kotlincode.concepts.abstractandinterface

class Hippo :Animal(),Romable{

    override val food ="Grass"
    override val habitat="Water"

    override fun makeNoise(){
        println("Hippo is making noise")
    }
    override fun eat(){
        println("Hippo is eating $food")
    }

    override fun roam() {
        println(super<Romable>.roam()) // println(unit) therefore kotlin.unit is printed
        println("Hipoo is roaming")
    }
}