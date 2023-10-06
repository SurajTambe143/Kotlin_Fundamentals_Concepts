package kotlincode.concepts.scopefunctionexample

import kotlincode.concepts.dataclassexample.Person

data class Employee(var name:String, var id: Int =0, var address:String ="") {
}

fun main(){
    //1)Apply use
    var person1=Employee("Suraj", address = "NSP").apply {
        var name="Suraj Tambe"
        this.name=name
        id=1
    }
    println(person1)

    //2) also
    var details= mutableListOf<Int>(2,3,4)
    details.also {
        it.add(5)
        it.add(10)
        it.add(2)
    }
    println(details)

    //3)with
    with(person1){
        println("with person name ${name}")
    }
    with(details){
        println("With is called with $this")
        println("It contains elements $size")
    }

    //4) run
    // operation on object
    var p1:Employee? =Employee("Anush",1,"dahisar")
    p1?.run {
        id=2
        println("It does not contain null therefore has value $this")
    }
    //No object context
    var p4= run {
        val name:String="Dummy Name"
        val id:Int=10
        val address:String="Sobo"
        println("Name is $name Id is $id and address in $address")
    }
//    println(p4.name)


    //5)Let
    var p2:Employee? =Employee("Deepak",2,"NSP")
    p2?.let {
        it.id=3
        println("It does not contain null therefore has value $it")
    }
}