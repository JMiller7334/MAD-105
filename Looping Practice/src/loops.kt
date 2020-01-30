
fun main() {
    var uInput = 0
    var Selected = ("None")

    do {
        println("Welcome to the resturant")
        println("Please enter the corresponding number to menu item that you would like!")

        println("1: burger")
        println("2: fries")
        println("3: pasta")
        println("4: Cake")
        println("5: Ice cream")
        println("6. Exit menu")

        println("Please enter number here: ")
        uInput = readLine()!!.toInt()
    } while (uInput <1 || uInput >6)
    when (uInput) {
        1 -> Selected = ("Burger")
        2 -> Selected = ("Fries")
        3 -> Selected = ("Pasta")
        4 -> Selected = ("Cake")
        5 -> Selected = ("Ice cream")
        6 -> Selected = ("To leave menu")
    }
    print("You selected $Selected")
}