fun main(){
    var contact = Person(firstName = "Jake", lastName = "smith", Middle = "J")

    contact.firstName = "Mike"
    println("${contact.fullName}")

    var xDir : compass
    //compass.WEST
    var Result = toDir(compass.NORTH)
    println(compass.NORTH.displayDir()) // call the enum class function. .Ordinal returns ints
}

fun toDir(dir:compass): String { //String is what this function returns
    when (dir){
        compass.NORTH -> return "To North"
        compass.SOUTH -> return "To South"
        compass.EAST -> return "To East"
        compass.WEST -> return "To West"
        else -> return "Nowhere"
    }
}