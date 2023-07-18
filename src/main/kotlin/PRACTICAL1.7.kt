tailrec fun fact(a:Int):Int{
    if(a==0||a==1)
    {
        return 1
    }
    else
    {
        return a*fact(a-1)
    }
}
fun main(){
    print("Enter Number: ")
    val a= readLine()?.toInt()!!
    val factorial=fact(a)
    println("Factorial of $a is :$factorial")
}
