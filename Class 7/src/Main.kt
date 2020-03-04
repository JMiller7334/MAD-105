/**
 * fun main:
 * @author Jacob Miller
 * date: 3/3/20
 *
 *  Main function used for creating classes to store data on people
 *  @param whatever = description
 *  MODS
 *  3/3/20 JJM I changed main functions.
 */

fun main(){

    var person1 = Person("John", "Doe")
    var person2 = Teacher("Math", "John", "Smith")
    var person3 = BusinessPerson("ACME", "Mike", "Robertson")

    println("${person1.fullName}")
    println("${person2.subject}")
}