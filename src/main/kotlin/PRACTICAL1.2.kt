fun main(){
    //Integer to Double
    val a:Int=10
    println("Integer value is $a")
    val b:Double=a.toDouble()
    println("Double value (from Integer): $b")

    //String to Integer
    val c:String="123"
    val d:Int=c.toInt()
    println("Integer value (from string):$d")

    //String to Double
    val e:String="11.23"
    val f:Double=e.toDouble()
    println("Double Value (from String):$f")

}