import java.text.DecimalFormat

fun main(){
    val tax = .07
    val cost = 100

    var totalcost = tax * cost
    println(totalcost) // prints long decimal
    // best to format numbers at the end

    var twodigit = DecimalFormat("0000.00")
    var formatcost =  twodigit.format(totalcost)

    println(formatcost)

    var newformat = DecimalFormat("$#,###.00")
    var newformatcost =  newformat.format(totalcost)
    println(newformatcost)
}