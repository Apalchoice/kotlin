fun main(args: Array<String>) {
//for loop
    for (i in 5..15){
        println("my loops:$i")
    }
    var myarr= arrayOf("eric","alex","grace","claire")
    for (names in myarr){
        println("student:$names")
    }
    //do while
    var num=30
    do {
        println("loop:$num")
        num++
    }while (num<=110)
}