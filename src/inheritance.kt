open class Animal{
    var age = 2
    var gender = "Male"
}


open class Dog : Animal(){
    fun bark(){
        println("Woof!! Woof!!")
    }
}

open class Cat{
    fun meow(){
        println("Meow!! Meow!!")
    }
}

fun main() {
    var a = Animal()
    var d = Dog()
    var c = Cat()
}