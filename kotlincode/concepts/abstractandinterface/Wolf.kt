package kotlincode.concepts.abstractandinterface

class Wolf:Animal(){
    override val food ="Meats"
    override val habitat="Forests"

    override fun makeNoise(){
        println("Wolf is making noise")
    }
    override fun eat(){
        println("Wolf is eating $food")
    }

}