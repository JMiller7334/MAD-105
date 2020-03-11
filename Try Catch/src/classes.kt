open class Customer (Name: String, Phone: String, Address: String, squareFootage: Double) {

    var Name: String = ""
        get() = field
        set(value) {
            field = value
        }
    var Phone: String = ""
        get() = field
        set(value) {
            field = value
        }
    var Address: String = ""
        get() = field
        set(value) {
            field = value
        }

    var squareFootage: Double = 0.00
        get() = field
        set(value) {
            field = value
        }
    init {
        this.Name = Name
        this.Phone = Phone
        this.Address = Address
        this.squareFootage = squareFootage
    }
}

class Commercial (Name: String, Phone: String, Address: String, squareFootage: Double,
                  propertiesOwned: Int, propertyName: String): // set parameters of new class
    Customer(Name, Phone, Address, squareFootage) { // Declares base class

    var propertiesOwned: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var propertyName: String = ""
        get() = field
        set(value) {
            field = value
        }

    init {
        this.propertiesOwned = propertiesOwned
        this.propertyName = propertyName
    }

    fun getWeeklyCost(){
        val rate = 5.00 // used val instead of var because it is never modified.
        var cost = rate * squareFootage
        if (propertiesOwned > 0)
            cost = cost + (cost * 0.10) // 10% off!

        println("Weekly cost:$$cost | square footage: $squareFootage | properties owned: $propertiesOwned " +
                "| Name: $Name | $Phone | $Address | ")
    }
}


class Residential (Name: String, Phone: String, Address: String, squareFootage: Double,
                   Senior: Boolean): // set parameters of new class
    Customer(Name, Phone, Address, squareFootage) { // Declares base class

    var Senior: Boolean = false
        get() = field
        set(value) {
            field = value
        }

    init {
        this.Senior = Senior
    }

    fun getWeeklyCost(){
        val rate = 5.00 // used val instead of var because it is never modified.
        var cost = rate * squareFootage
        if (Senior == true)
            cost = cost + (cost * 0.15) // 15% off!

        println("Weekly cost:$$cost | square footage: $squareFootage | Senior: $Senior | Name: $Name " +
                "| $Phone | $Address | ")
    }
}