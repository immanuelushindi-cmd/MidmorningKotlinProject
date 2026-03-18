fun main() {
    //While loop

    var number = 200
    while (number <= 205){
        println("Number : $number ")
        number ++
    }

    //For Loop
    for (x in 30 .. 40){
        println("Number : $x")
    }

    for (letter in 'a'..'f'){
        println("My letter is $letter")
    }


    //Arrays
    var cars =arrayOf("Volvo", "Mercedes", "Toyota")

    for (car in cars){
        println(car)

    }


}


