fun main(){

    var answers1 = arrayOf<String>("10", "25", "32", "50", "60")
    var answers2 = arrayOf<String>("ten", "twenty five", "thirty two", "fifty", "sixty")
    var questions = arrayOf<String>("5 x 2 = ", "12 + 8 + 5 =", "8 x 4 =", "5 x 10 =", "6 x 10 =")

    var current = 0
    var right = 0
    var wrong = 0


    println("this is a simple 5 question math quiz!")
    println("you may answer in digits ie:10' or words ie:ten")
    for (i in 0..questions.size - 1) {
        print(questions[current])
        print("please enter an answer")
        var userInput = readLine()!!.toString().toLowerCase()

        if (userInput == answers1[current] || userInput == answers2[current]){
            right = right + 1
            println("You got the right answer")
        }else {
            println("wrong! the correct asnwer was ${answers2[current]}")
            wrong = wrong + 1
        }
        current = current + 1
    }
    println("results: correct: $right | incorrect: $wrong")

}