package kotlincode.concepts.constructorexample

//1)Automatic Constructor creation and value assign
//class Dog(val name:String ,var weight: Int , val breed :String) {
//    var activities= arrayOf("Walking")
//    fun bark(){
//        println("Whoof Name: $name Weight:$weight Breed:$breed and doing activity of $activities ")
//    }
//}


/*
       2) We are assigning vale of the constructor to class variables
       parameters in Dog(example name_dummy) are constructor parameters
       and name is class variable
       Don't use var or val for assigning in constructor
 */
//class Dog(name_dummy:String ,weight_dummy: Int , breed_dummy :String) {
//    val name=name_dummy
//    var weight=weight_dummy
//    val breed=breed_dummy
//    fun bark(){
//        println("Whoof Name: $name Weight:$weight Breed:$breed")
//    }
//}

fun main(){
    var Dog1= Dog("Fido",70,"Mixed")
    Dog1.bark()
    println( "Dog weight before set is ${Dog1.weight}")
    Dog1.weight=0
    println("Dog set weight is ${Dog1.weight}")
    println("Dog weight in kgs are ${Dog1.weightInKgs}")

}

//Getter and setter ,we have to just define varables in constructor late initialise it
class Dog(val name:String ,weight_dummy: Int , breed_dummy :String) {
    var weight=weight_dummy
        set(value) {
            if (value>0) field=value
            else println("Weight cannot be set")
        }
        get() = field

    val weightInKgs : Double
        get() = weight/2.2

    val breed=breed_dummy
    fun bark(){
        println("Whoof Name: $name Weight:$weight Breed:$breed")
    }

    init {
        println("This is init block")
    }
}