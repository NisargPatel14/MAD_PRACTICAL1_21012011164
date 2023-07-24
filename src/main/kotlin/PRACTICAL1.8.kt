import java.util.*
fun sortarray(arr:IntArray,n:Int):IntArray
{
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}
val arr = { size:Int-> Array<Int>(size){index->index}}
fun main()
{
    //Different ways to create Arrays
    var a= arrayOf<Int>(10,90,60,80,100)
    println(Arrays.deepToString(a))

    var a1=Array<Int>(5){0}
    println(Arrays.deepToString(a1))

    val a2=arr(5)
    println(Arrays.deepToString(a2))

    var a3=IntArray(5){0}
    println(a3.joinToString())

    var a4= intArrayOf(1,2,3,4,5)
    println(a4.joinToString())

    var a5= arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println(a5.contentDeepToString())

    //using inbuilt sort function
    var a6=IntArray(5)
    for(i in a6.indices)
    {
        print("a[$i]=")
        a6[i]=readLine()!!.toInt()
    }
    a6.sort()
    //contentToString Method
    println(a6.contentToString())
}