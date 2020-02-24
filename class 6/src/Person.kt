class Person constructor(
    firstName:String,
    lastName:String,
    Middle: String){ // set up the properties for the class


    var fullName: String = ""

    var firstName: String = firstName // run properties down here as variables and create setter and getters.
        get() = field
        set(value) {
            field = value
            // anything that should be update along with class properties should be placed under setter/getters.
            fullName = "$firstName $Middle $lastName"
        }

    var lastName: String = firstName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $Middle $lastName"
        }

    var Middle: String = firstName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $Middle $lastName"
        }

    init{
       fullName = "$firstName $Middle $lastName"
    } // called only once on creation.

}