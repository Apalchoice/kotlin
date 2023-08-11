fun alex(){
    println("this is a user defined function")
}
fun main(args: Array<String>) {
    alex()
    arith()
}

fun arith() {
    var num=4
    var num2=67
    println("the sum of$num and $num2 is:${num +num2}")
    println("the product of$num and $num2 is:${num *num2}")
    println("the quotient of$num and $num2 is:${num /num2}")
    println("the difference of$num and $num2 is:${num -num2}")

}
