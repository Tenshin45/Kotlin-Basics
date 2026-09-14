fun main() {
    //While /*
    // While(condition){ block of code to be executed if condition is true }
    // */
    var y=1
    while (y<=10) {
        println(y)
        y++
    }
    var inpt=""
    //Loop still user types exit
    while(inpt!="exit"){
        print("Type 'exit' to continue: ")
        inpt=readln() ?:""
        println("You typed: $inpt")
    }
    /*
    do{ block of code to be executed if condition is true }while(condition)
     */
    //Print 3..9
    y=3
    do {
        print("The value is: $y")
        y++
    }while (y<=9)
    /*
    * If-specifies a block of code to be executed if validation is true--if(condition){block of code to be executed if condition is true}
    * else{block of code to be executed if condition is false}
    * For multiple conditions --if(condition1){block of code to be executed if condition1 is true}elseif(condition2){block of code to be executed if condition2 is true}
    * else--{block of code to be executed if all conditions are false}
    * */
    val x = 5
    if (x > 4) {
        println("$x is greater than 4")
    }
    print("Enter your name: ")
    val name = readln()
    println("Your name is $name")
    print("Enter your age: ")
    val input = readln()
    val age = input.toIntOrNull()
    println("Your age is $age years old")
    if (age != null && age > 0) {
        if (age >= 18) {
            println("$name you can drive")
        } else {
            println("$name you cannot drive")
        }
    }
    //When
    print("Enter the number to display day of the week: ")
    val day = readln().toIntOrNull() ?:0
    when (day) {
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("Invalid Input..enter number btw 1..7")
    }
    print("Enter your quote to display your grade: ")
    var quote = readln().toIntOrNull() ?: 0
    when {
        quote == 100 -> println("Good quote ! your grade is A++")
        quote in 90..99 -> println("your grade is A+")
        quote in 70..90 -> println("your grade is A")
        quote in 59..70 -> println("your grade is B")
        quote in 50..59 -> println("your grade is B-")
        quote in 45..50 -> println("""your grade is C "You need to take the resit exams." """)
        quote in 0..45 -> println("""your grade is D "Fail" """)
    }
    //For multiple conditions
    print("Enter your marks to display your grade: ")
    var marks = readln().toIntOrNull() ?: 0
    if (marks == 100) {
        println("$name your grade is A++")
    } else if (marks in 90..99) {
        println("$name your grade is A+")
    } else if (marks in 70..90) {
        println("$name your grade is A")
    } else if (marks in 59..70) {
        println("$name your grade is B")
    } else if (marks in 50..59) {
        println("$name your grade is B-")
    } else if (marks in 45..50) {
        println("""$name your grade is C "You need to take the resit exams." """)
    } else if (marks in 0..45) {
        println("""$name your grade is D "Fail" """)
    }


}