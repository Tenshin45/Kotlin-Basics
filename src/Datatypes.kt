fun main(){
    //Numeric datatype
      /*
        integers-byte, short,long,int
      */
    val x: Int =89
    println(x)
    print(x :: class)
    val a: Byte =10
    println(a)
    print(a ::class)
    //Long-add suffix L
    val b: Long =1829839923453989839L
    println(b)
    println(b::class)
    //Floating point numbers-float, double
    //Float-add suffix f
    val c: Float =78.45F
    println(c)
    println(c::class)
    //Double
    val d: Double =3.14
    println(d)
    println(d::class)
    //Strings store a sequence of characters
    val Name="Jane"
    println(Name)
    //print(Name::class)
    //Type conversion to Long(), to Int(), to Float()
    val p=11.3580
    println(p.toInt())
    println(p.toFloat())
    //println(p.to())
    val text = """
                Hello,
                Kotlin
               """

    val quote = """Kotlin says, "Hi"."""


}