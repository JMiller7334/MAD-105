class Employee constructor(
    var name: String,
    var number: Int,
    var shift: Int) {

    fun printInfo(){
        println("employee name: $name | employee number: $number | employee shift: $shift")
    }



}