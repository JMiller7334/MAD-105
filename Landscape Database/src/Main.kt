fun main(){

    var customer1 = Residential("John", "555-555-5555", "somewhere",
        500.00, true)

    var customer2 = Commercial("Tom", "555-555-5555", "Tech way", 1000.00,
        2, "Amazon")

    println("Please enter value for the type of information you would like to display.")
    println ("1: Residential, 2: Commercial")
    var uInput = readLine()!!.toInt()
        if (uInput == 1)
            customer1.getWeeklyCost()

    else
        customer2.getWeeklyCost()
}