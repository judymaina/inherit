import java.util.MissingFormatArgumentException

fun main(){
var car=Car("nissan","audi","blue",6)
    car.carry(2)
    car.identity()
    car.calculateParkingFee(2)
    var bus=Bus("toyota","coach","yellow",50)
    bus.maxTripFare(50.0)
    bus.calculateParkingFee(12)
    bus.carry(90)
    bus.identity()
}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var krr = people - capacity
        if (people <= capacity) {
            println("Carry $people passanger")

        } else {

            println("over capacity by $krr people")

        }
    }
fun identity() {
println("I have a $color $make $model")

}
    open fun calculateParkingFee(hours:Int):Int{
        var time=hours * 20
        println(time)
        return time
    }
}
class Bus(make:String,model:String, color:String, capacity:Int):Car(make,model,color,capacity){
      fun maxTripFare(fare:Double):Double{
      var tripfare=capacity * fare
          println(tripfare)
          return tripfare
}

    override fun calculateParkingFee(hours: Int): Int {
     var parkingFee=hours * capacity
        println(parkingFee)
        return parkingFee
    }
}