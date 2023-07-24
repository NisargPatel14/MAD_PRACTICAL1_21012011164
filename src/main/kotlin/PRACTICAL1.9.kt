fun main()
{
    var a=IntArray(5)
    for(i in a.indices)
    {
        print("a[$i]=")
        a[i]=readLine()!!.toInt()
    }
    var max=0
    for(i in a)
    {
        if(i>max)
            max=i
    }
    println("Maximum number is:$max")
}