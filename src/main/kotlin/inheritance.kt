open class animal(val name:String){
    open fun makesound(){
        println("$name makes sound")
    }
}
class Cat(name: String):animal(name){
    override fun makesound(){
        println("$name meows")
    }
}
class Dog(name:String):animal(name){
    override fun makesound(){
        println("$name barks")
    }
}
class Cow(name:String):animal(name){
    override fun makesound(){
        println("$name moos ")
    }
}

fun main(args: Array<String>) {
    val dog=Dog(name = "bosco")
    val cat=Cat(name = "maxy")
    val cow=Cow(name = "venisha")
    dog.makesound()
    cat.makesound()
}