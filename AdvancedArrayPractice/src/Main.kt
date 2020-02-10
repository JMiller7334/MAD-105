fun main() {
    println("we sell soda!!!!")
    println("Here is our inventory")
    var Soda = arrayOf<String>("sprite", "cola", "root beer", "pepsi", "crush")
    var qty = arrayOf<String>("10", "9", "3", "5", "7")
    for (i in 0..Soda.size - 1) {
        println("$i. ${Soda[i]}")
    }
    println("If you would like to modify our directy please enter the number next to soda for the quntity you would like to change.")
    var uInput = readLine()!!.toInt()
    if (uInput >=0 || uInput <= Soda.size){
        println("You've select ${Soda[uInput]} We currently have ${qty[uInput]} in stock.")
        println("please enter the new quantity:")
        var qtyInput = readLine()!!.toInt()

        if (qtyInput >= 0){
            qty[uInput] = qtyInput.toString()

        }else
            println("value must be above 0")

        println("our inventory is as follows...")
        for (i in 0..Soda.size - 1) {
            println("$i. ${Soda[i]} we have ${qty[i]} in stock")
        }

    }
}