import kotlin.math.abs // imports abs functions I suppose

fun main(args: Array<String>){ // sets up user input?
    var Temperature = 0.00

    while (Temperature > 104.0 || Temperature < 92.4){
        println("Please enter a number between 92.4 and 104.0")
       Temperature = readLine()!!.toDouble() // Double is easier than using floats when a decimal is needed.
        if (Temperature > 104.0 || Temperature < 92.4){
            println("Your entry was outside of range.")
        }
        else {
            if (Temperature < 97.5)
                println("Temperature is low")
            else if (Temperature > 99.5)
                println("Temperature is high")
            else
                println("Temperature is normal")
        }
    }
    println("closing program")
}