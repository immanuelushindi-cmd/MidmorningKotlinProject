fun main() {
    //While loop

    var number = 200
    while (number <= 205){
        println("Number : $number ")
        number ++
    }

    //For Loop
    for (num in 10..15){
        println("Number is $num")
    }

    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }

    var cars = arrayOf("Toyota", "Mercedes","Volvo")
    for (car in cars){
        println(car)
    }
}

//Break and continue statement

