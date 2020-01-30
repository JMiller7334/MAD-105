fun main(args: Array<String>){
    var Uinput = 0
    var numString = ("no entry")

    while (Uinput > 10 || Uinput < 1){
        println("Please enter a number between 1 and 10")
        Uinput = readLine()!!.toInt()
        if (Uinput > 10 || Uinput < 1){
            println("Your entry was outside of range.")
        }
        else {
            when (Uinput){
                1 -> numString = ("ichi")
                2 -> numString = ("ni")
                3 -> numString = ("san")
                4 -> numString = ("shi")
                5 -> numString = ("go")
                6 -> numString = ("Roku")
                7 -> numString = ("shichi")
                8 -> numString = ("hachi")
                9 -> numString = ("kyuu")
                10 -> numString = ("juu")
            }
        println("In Japanese $Uinput is $numString")
        }
        }
    println("closing program")
}