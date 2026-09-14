class Car(val id: Int, val brand: String, val year: Int, val model: String, val grade: String){
    fun displayDetails(){
        println("The car is $brand $model made in the year $year its grade is $grade ID: $id")
    }
}
fun main(){
    val car1=Car(brand = "Mercedes", year = 2020, model = "Benz", grade = "A+", id = 1)
    car1.displayDetails()
}
