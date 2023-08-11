class Cars {
    var brand = ""
    var price = 0
    var specs = ""
}

fun main(args: Array<String>) {
    // create object
    val myobj=Cars()
    myobj.brand="toyota"
    myobj.price=650000
    myobj.specs="in-line 6 engine 4 wheel turbo"
    println("my car is ${myobj.brand}it is ${myobj.specs} and cost${myobj.price}")
}

