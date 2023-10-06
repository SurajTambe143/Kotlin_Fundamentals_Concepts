package kotlincode.concepts.abstractandinterface

fun main(){

    var a=Hippo()
    a.makeNoise()

    a.roam()

    var animal= arrayOf(Hippo(),Wolf(),Vehicle())
    for (item in animal){
        if (item is Animal) item.roam()
    }

}