import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(){
    var today = LocalDate.now()
    var last = LocalDate.of(2020, 2,9) // last full moon
    var next = LocalDate.of(2020, 3, 9)
    var formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd")

    var daystoFM = today.until(next, ChronoUnit.DAYS)

    println(daystoFM)
    
}