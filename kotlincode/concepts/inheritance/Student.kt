package kotlincode.concepts.inheritance

open class Student: Human() {

    override val name: String ="Suraj"
    override val age: Int =22
    override val gender: String ="Male"
    override val designation: String="Student"

    override fun action() {
        println("This is $designation who's Name:$name Age:$age and Gender:$gender")
    }

}