fun main(){
    //Variables-is a container for storing data. val or var
    //val variablename=value
    //var variablename=value
    //val-once you create the variable you cannot reassign the value
    val Student_Name="Ruth"
    println(Student_Name)
    val age=17
    println(age)
    //var-create a variable that you cannot reassign the value
    var First_Name="Josephine"
    println(First_Name)
    //reassign the variable value
    First_Name="Emmanuel"
    println(First_Name)
    /*
    * Variable name cannot have spaces
    * Variable name cannot be a Kotlin keyword
    * Variable name cannot start with a number
    * Variable name can contain letters, numbers and underscore
    * Variable name must start with underscore or letter
    * */
    First_Name="Ansima"
    println(First_Name)
    var Last_Name="Barhayiga"
    println(Last_Name)
    var _Course="Kotlin"
    println(_Course)
    var School="eMobilis"
    println("My name is $First_Name $Last_Name")
    println("I am $age years old")
    println("I am learning $_Course at $School")
}