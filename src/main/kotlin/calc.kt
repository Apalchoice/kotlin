fun complexcalc(){
    println("complex calculator")
    print("enter first number")
    val num1= readln()?.toDoubleOrNull()
    print("enter operator(+,-,*,/:")
    val operator= readln()
    print("enter second number")
    val num2= readln()?.toDoubleOrNull()
    if(num1==null||operator == null||num2==null){
    println("invalid input.please put correct numbers and operators ")
    return
    }
val results=when(operator) {
    "+" -> num2 + num2
    "-" -> num2 - num2
    "*" -> num2 * num2
    "/" -> if (num2 != 0.0) num1 / num2 else "you can not divide by zero"
    else -> "invalid operator"
}
println("answer is $results")
}
fun main(args: Array<String>) {
    complexcalc()
}