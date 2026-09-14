fun main(){
    println("Hello World this is main function ")
    greet()
    greetuser()
    println(addTwoNumbers(num1 = 33, num2 = 45))
    println(multiplyTwoNumbers(Lenght = 67, Width = 9))
}
fun greet(){
    println("Enter your name: ")
    val name=readln()
    print("Hello $name ")
}
fun greetuser(){
    println("Welcome to Kotlin")
}
fun addTwoNumbers(num1: Int, num2: Int): Int{
    return num1 + num2
}
fun multiplyTwoNumbers(Lenght: Int, Width: Int): Int{
    return Lenght * Width
}