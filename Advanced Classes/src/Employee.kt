enum class Position {ADMINISTRATION, PRODUCTION, SALES, MAINTENANCE, TECHNICAL, SECRETARIAL};



class Employee constructor(name: String, job: Position, salary: Boolean, shift: Int, payrate: Double) {

    var name: String = name
        get() = field
        set(value) {
            field = value
        }
    var job: Position = job
        get() = field
        set(value) {
            field = value
        }
    var salary: Boolean = salary
        get() = field
        set(value) {
            field = value
        }
    var shift: Int = shift
        get() = field
        set(value) {
            field = value
        }
    var payrate: Double = payrate
        get() = field
        set(value) {
            field = value
        }
    fun printInfo(){ // function to print employee information in an understandable format.
        println("name: $name | Job: $job | employee shift: $shift | salary: $salary | payrate: $payrate")
    }
    fun calcPay(hours: Double){
        if (salary == false){
            var OTHours = 0.00
            if (hours > 40.00)
                OTHours = (hours - 40.00)

            var payout = (hours * payrate) + (OTHours * (payrate + payrate/2))
            if (shift == 2)
                payout = payout + (payout * 0.05) // shift bonus @ 5%
            else if (shift == 3)
                payout = payout + (payout * 0.10)// shift bonus @ 10%

            println("name: $name | hours worked: $hours | payout: $payout")
        }
        else{
            println("This employee is salary. Their payout is their payrate.")
            println("name: $name | hours worked: $hours | payout: $payrate")
        }
    }
}

