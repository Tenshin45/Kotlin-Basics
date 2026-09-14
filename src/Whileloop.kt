fun main() {
    //While /*
    // While(condition){ block of code to be executed if condition is true }
    // */
    var y = 5
    while (y <= 10) {
        println(y)
        y++
    }
    var inpt = ""
    //Loop still user types exit
    while (inpt != "exit") {
        print("Type 'exit' to continue: ")
        inpt = readln() ?: ""
        println("You typed: $inpt")
    }
    /*
    do{ block of code to be executed if condition is true }while(condition)
     */
    //Print 3..9
    var x = 3
    do {
        println("The value is: $x")
        x++
        if (x == 8) break
    } while (x <= 9)
    x=1
    while (x <= 10) {
        if (x == 8) {
            continue
        }
        println(x)
        x++
    }
}