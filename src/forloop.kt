fun main(){
    /*
    for loop-iterates through a collection, range
    for (item IN COLLECTION)
    //
     */
    var courses= listOf("HTML","CSS","BOOTSTRAP","PYTHON","KOTLIN")
    for (course in courses) {
        println(course)
    }
    var students=arrayListOf("Emmanuel","Etienne","Heritier","Joseph","Ruth")
    for (student in students) {
        println(student)
    }
    var y=readln()!!.toInt()
    for (y in 1 until 10 step 2) {
        println(y)
    }
    for (x in 90 downTo  10) {
        println(x)
    }
    for (letter in 'A'..'Z') {
        println(letter)
    }
}

