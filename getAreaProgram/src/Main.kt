fun getAreaCircle(radius:Double):Double{
    var area = 0.00
    area = radius * radius * 3.14
    return area
}

fun getAreaTriangle(base:Double, height:Double):Double{
    var area = 0.00
    area = 0.5 * base * height
    return area
}

fun getAreaSquare(size:Double):Double{
    var area = 0.00
    area = size * size
    return area
}

fun getAreaRectangle(Width:Double, height:Double):Double{
    var area = 0.00
    area = Width * height
    return area
}


fun main(){
    println("Welcome to the getArea Program")
    println("1: Circle, 2: triangle, 3: square, 4: rectangle")
    println("Please enter a number for the shape you would like to get the area of: ")
    var uInput = readLine()!!.toInt()
    if (uInput == 1){
        print("Please enter the radius of the circle:")
        var InputSize = readLine()!!.toDouble()
        var Answer = getAreaCircle(InputSize)
        println("The size of a circle with radius $InputSize is $Answer")

    }else if (uInput == 2) {
        print("Please enter the base of the triangle: ")
        var InputBase = readLine()!!.toDouble()
        print("Please enter the base of the triangle: ")
        var InputHeight = readLine()!!.toDouble()

        var Answer = getAreaTriangle(InputBase, InputHeight)
        println("The area size of the Triangle is $Answer")

    }else if (uInput == 3) {
        print("Please enter the size of the square. Use format: ")
        var InputSize = readLine()!!.toDouble()

        var Answer = getAreaSquare(InputSize)
        println("The area size of the Square is $Answer")

    }else if (uInput == 4) {
        print("Please enter the width of the rectangle: ")
        var InputWidth = readLine()!!.toDouble()
        print("Please enter the height of the rectangle: ")
        var InputHeight = readLine()!!.toDouble()

        var Answer = getAreaRectangle(InputWidth, InputHeight)
        println("The area size of the rectangle is $Answer")


    }else
        println("Invalid entry")

}