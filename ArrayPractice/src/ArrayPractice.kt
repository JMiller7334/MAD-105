fun main() {
    println("we sell soda!!!!")
    println("Here is our menu!")
    var Soda = arrayOf<String>("sprite", "cola", "root beer", "pepsi", "crush")
    for (i in 0..Soda.size -1){
        println("$i. ${Soda[i]}")
    }
    println("Thats it!")
}