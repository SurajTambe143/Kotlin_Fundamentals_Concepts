package kotlincode.concepts.dataclassexample

data class Person(val name:String,val age:Int,val gender:String)

fun main(){

    var p1=Person("Suraj",22,"Male")
    var p2=Person("Women",25,"Female")
    var p3=p1.copy("Anush")
    var p4=p1.copy()

    println("Person one has name ${p1.name} is a male ${p1.gender} and age ${p1.age}")
    println("Person one has name ${p2.name} is a male ${p2.gender} and age ${p3.age}")
    println("Person one has name ${p3.name} is a male ${p3.gender} and age ${p3.age}")

    println(p1.toString())
    val name=p1.component1()
    val age=p1.component2()
    val gender=p1.component3()
    println("$name $age $gender")

    println("Hashcode of Suraj: ${p1.hashCode()}")
    println("Hashcode of Women: ${p2.hashCode()}")
    println("Hashcode of Anush: ${p3.hashCode()}")
    println("Hashcode of Copu of Suraj: ${p4.hashCode()}")

    if (p1.equals(p4))
        println("Suraj is equal to Suraj copy.")
    else
        println("Suraj is not equal to Suraj copy.")


}