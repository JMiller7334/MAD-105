open class Person (firstName: String,
              lastName: String){

    var firstName: String = ""
        get() = field
        set(value) {
            field = value
            this.fullName = setFullName()
        }
    var lastName: String = ""
        get() = field
        set(value) {
            field = value
            this.fullName = setFullName()
        }
    var fullName : String = ""

    init {
        this.firstName = firstName // this refers to THIS class, instance of this class
        this.lastName = lastName
        this.fullName = setFullName()
    }

    fun setFullName(): String {
        return "$firstName $lastName"
    }

}

final class BusinessPerson(var company: String,
                    firstName: String,
                    lastName: String):
    Person(firstName, lastName){

    init{

    }
}