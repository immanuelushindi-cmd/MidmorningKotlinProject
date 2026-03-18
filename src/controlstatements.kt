import kotlin.math.PI

fun main() {

    //Program to determine room condition

    var temperature = 67

    if (temperature > 25){

        println("The temperature is $temperature")
        println("It is too hot")

    }
    else if (temperature < 25) {
        println("It is too cold")
    }
    else{
        println("Normal temperature")
    }

    //Program to check for even or odd number

    var number = 89
    if (number%2 == 0){
        println("$number is even number")
    }
    else{
        println("$number is odd number")
    }
}