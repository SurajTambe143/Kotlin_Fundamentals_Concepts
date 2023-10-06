package kotlincode.concepts.inheritance

open class Employee:Human() {

    override val name: String ="Suraj"
    override val age: Int =22
    override val gender: String ="Male"
    override val designation: String="Employee"

    override fun action() {
        println("This is $designation who's Name:$name Age:$age and Gender:$gender")
    }

}