import java.text.DecimalFormat

fun main(){
    println("welcome to the tip calculator!")
    println("enter the costs to get a sum. Enter 0 when you are finished!")

    var twoDigit = DecimalFormat("$###0.00")
    var userInput = 1.00
    var total = 0.00
    var loop = true

    while (loop == true){
        println("Current total: ${twoDigit.format(total)}")
        println("please enter a cost: ")
        var userInput = readLine()!!.toDouble()
        total = total + userInput
        if (userInput == 0.00)
            loop = false
    }

    var tax = (total * 2.5) * 0.01
    var tip = (total * 17.5) * 0.01
    var final = total + tip + tax
    println("Total: ${twoDigit.format(total)} | tax: ${twoDigit.format(tax)} | recommended tip: ${twoDigit.format(tip)}")
    println("Grand Total: ${twoDigit.format(final)}")
}