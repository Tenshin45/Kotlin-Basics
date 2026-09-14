fun main (){
    //Strings store a sequence of characters
    val text = """
                Hello,
                Kotlin
               """.trimIndent()
    println(text)

    val quote = """Kotlin says, "Hi"."""
    println(quote)
    val message= "Kotlin Dashboard."
    println(message)
    //string methods
    println(message.length)
    println(message.uppercase())
    println(message.lowercase())
    //string template-embedding variables or expression
    //inside a strings-strings interpolation
    var First_Name="Ansima"
    println(First_Name)
    val Middle_Name: String ?= null
    println(Middle_Name)
    var Last_Name="Emmanuel"
    println(Last_Name)
    //concatenation +
    println(First_Name+" "+Middle_Name+" "+Last_Name)
    val age=17
    println(age)
    var _Course="Kotlin"
    println(_Course)
    println(_Course.replace(oldValue = "Kotlin", newValue="Python"))
    //accessing characters [index]
    println(_Course[0])
    println(_Course[2])
    var School="eMobilis"
    println("My name is $First_Name ${First_Name.length} ${Middle_Name ?: "Barhayiga"} $Last_Name ${Last_Name.length}")
    println("I am $age years old")
    println("I am learning $_Course at $School")


}