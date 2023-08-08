class Student(var enono:Int, var name:String){

    constructor():this(164,"Nisarg")
    {
        println("Constructor is called")
    }
    init{
        println("Init is called")
    }
    fun print(){
        println("Student details are:")
        println(enono)
        println(name)
    }
}
fun main(){
    val obj1 = Student()
    obj1.print()
}