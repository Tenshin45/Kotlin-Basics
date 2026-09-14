//inheritance allows a class (subclass or child) to inherit properties and functions from another class (superclass or parent)
open class Family{
    val familyName="Mawa"
    open fun getFamilyRules(){
        println("Home bedtime is 10pm")
    }
}
class Child( val name: String):Family(){

    fun childDetail(){

        println("My name is $name $familyName")
    }
   //override the parent method to change the rules
    override fun getFamilyRules() {
        println("Home bedtime is 11pm")
    }
}
fun main(){
    val child1 = Child(name = "Jonathan")
    child1.childDetail()
    child1.getFamilyRules()
}