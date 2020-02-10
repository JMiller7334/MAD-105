fun main(){
    var s1 = "thing"
    var s2 ="THING"
    if (s1.compareTo(s2, true) == 0)
        println("same")
    else
        println("not same")

    println(s2.toLowerCase().capitalize())

    println("the length is ${s2.length}")
    println("the first character is ${s2[0]}")

    var results1 = s1.indexOf('h')
    println(results1)

    println(s1.substring(results1, 3))

    println(s1.contains("hi", true))
    println(s1.replace("thing", "other thing", true))
}