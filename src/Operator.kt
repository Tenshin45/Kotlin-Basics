fun main(){
    //Arithmetic operators
    var x=45
    println(x)
    var y=89
    println(y)
    println("The sum is ${x+y}")
    println("The difference is ${x-y}")
    println("The product is ${x*y}")
    println("The quotient is ${x/y}")
    println("The quotient is ${y/x}")
    x++
    println(x)
    y--
    println(y)
    //Comparison operators >,<,==,!=,<=,>=.return true or false
    println(x==y)
    println(x>y)
    println(x<y)
    println(x!=y)
    println(x>=y)
    println(x<=y)
    //Logical operator-&& and, || or, ! not
    //&&-returns true if both statement are true
    println(x!=y && x<=y)
    println(x!=y && x>=y)
    //||-returns true if one statement is true
    println(x!=y || x>=y)
    println(x!=y || x<=y)
    //!-returns the reverse
    println(!(x>=y))
    //Assignment operators
    x=10
    println(x)
    //+=
    x+=7//x=x+7
    println(x)
    //Null safety operators
    //?:-elvis operator-used to give a default value if null
    val Middle_Name: String ?= null
    val MyDefault=Middle_Name ?:"Ruth"
    println(MyDefault)
    //?.safe call operator.check for null before calling a function
    val Text: String ?= null
    val MyText=Text ?:"Hello World"
    println(MyText ?.length)
    println(Text ?.length)
}