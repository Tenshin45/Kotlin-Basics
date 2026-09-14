data class User(val id: Int, val name: String, val age: Int, val gender: String, val Email: String)
{
    fun displayDetails(){
        println("$name is $age years old")
        println("His gender is $gender and his email is $Email")
    }
}
fun main(){
    val user1=User(id = 1, name = "Joseph", age = 20, gender = "Male", Email = "joseph@gmail.com")
    println(user1)
    user1.displayDetails()
    val user2=User(id = 2, name = "Bruce", age = 22, gender = "Female", Email = "bruce@gmail.com")
    println(user2)
    user2.displayDetails()
}