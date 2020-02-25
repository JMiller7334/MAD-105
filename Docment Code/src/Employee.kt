class Employee constructor(
    name: String,
    number: Int,
    shift: Int) { // class constructer to set up class values.

    var name: String = name // Declare the variable, getters and setters are below.
        get() = field
        set(value) {
            field = value
        }

    var number: Int = number // Declare the variable, getters and setters are below.
        get() = field
        set(value) {
            field = value
        }

    var shift: Int = shift // Declare the variable, getters and setters are below.
        get() = field
        set(value) {
            field = value
        }

    fun printInfo(){ // function to print employee information in an understandable format.
        println("employee name: $name | employee number: $number | employee shift: $shift")
    }

}