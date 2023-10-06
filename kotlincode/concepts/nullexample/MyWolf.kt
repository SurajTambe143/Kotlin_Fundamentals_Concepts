package kotlincode.concepts.nullexample

class MyWolf {

    var wolf: Wolf? =Wolf()

    fun myFunction(){
        wolf?.eat()
    }

}