fun main(){
    var worker1 = Employee("Jacob", Position.TECHNICAL, false, 3, 15.00);
    worker1.printInfo()
    worker1.calcPay(40.00)

    var worker2 = Employee("Artoria", Position.SECRETARIAL, true, 2,860.00);
    worker2.printInfo()
    worker2.calcPay(40.00)
}

