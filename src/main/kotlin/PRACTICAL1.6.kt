fun addNums(a:Int , b:Int , c:Int):Int{
    val sum:Int=a+b+c
    println("sum of $a , $b , $c is :$sum")
    return sum
}
fun subNums(a:Int , b:Int , c:Int):Int{
    val sub:Int=a-b-c
    println("Subtraction of $a , $b , $c is :$sub")
    return sub
}
fun multNums(a:Int , b:Int):Int{
    val mult:Int=a*b
    println("Multiplication of $a , $b is :$mult")
    return mult
}
fun main(){
    println("Enter 3 Numbers: ")
    val a= readLine()?.toInt()!!
    val b= readLine()?.toInt()!!
    val c= readLine()?.toInt()!!

    addNums(a,b,c)
    subNums(a,b,c)
    multNums(a,b)
}