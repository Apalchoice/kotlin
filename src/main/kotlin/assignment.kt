fun main(args: Array<String>) {
    val marks=200
    if (marks<0){
        println("you have failed")
    }else if (marks>0 && marks<60)
        println("you have passed")
    else if (marks>60 && marks<80)
        println("you have credit")
    else if (marks>80 && marks<100)
        println("you have distinction")
}
