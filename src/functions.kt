fun main() {
    //Standard library Functions
    var result = Math.max(34,89)
    println(result)
    add()
    student("Immanuel", 19)
}

//User-Defined Functions
fun add (){
    println(45 + 20)

}

fun student(name: String,age :Int){
    println("My name is $name.I'm $age years old")
}

