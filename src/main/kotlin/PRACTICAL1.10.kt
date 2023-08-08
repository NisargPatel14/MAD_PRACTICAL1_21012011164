class Car(var type:String , var model:Int , var price:Int , var owner:String , var milesDriven:Int){
   init{
       this.type=type
       this.model=model
       this.price=price
       this.owner=owner
       this.milesDriven=milesDriven
   }
    fun getOriginalCarPrice()
    {
        println("Car price: $price")
    }
    fun getCurrentCarPrice()
    {
        val ans= price - (price*0.1)
        println("Current car price: $ans")
    }
    fun getCarInformation(){
        println("Car Type: $type")
        println("Car model: $model")
        println("Car owner: $owner")
        println("Total Miles Driven: $milesDriven")
        getOriginalCarPrice()
        getCurrentCarPrice()
    }
}
fun main(){
    val car1 = Car("BMW",2018,10000,"James",10000)
    val car2 = Car("Aston Martin",2023,50000,"John",1000)
    println("Creating object Car1 of Car Class and Init is called")
    println("----------")
    car1.getCarInformation()
    println("----------")

    println("Creating object Car2 of Car Class and Init is called")
    println("----------")
    car2.getCarInformation()
    println("----------")
}
