fun getInfo(Name:String, Phone:String):String{
    var info = ("Name: $Name | Phone $Phone")
    return info
}

fun getInfo(Name:String, Phone:String, Business:String):String{
    var info = ("Contact Name: $Name | Phone: $Phone | Business: $Business")
    return info
}


fun main(){
    println("If you are residental please enter 1 otherwise enter anyother number: ")
    var uInput = readLine()!!.toInt()
    var DisplayInfo = "no info"

    if (uInput == 1){
        println("please enter phone #:")
        var PhoneInput = readLine()!!.toString()

        println("please enter name:")
        var NameInput = readLine()!!.toString()
        DisplayInfo = getInfo(NameInput, PhoneInput)

    }else{
        println("please enter phone #:")
        var PhoneInput = readLine()!!.toString()
        println("please enter contact name:")

        var NameInput = readLine()!!.toString()

        println("please enter business name:")
        var BusinessInput = readLine()!!.toString()
        DisplayInfo = getInfo(NameInput, PhoneInput, BusinessInput)
    }
    println("Your information is as follows: $DisplayInfo")
}