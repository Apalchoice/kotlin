fun main(args: Array<String>) {
    var num=5
    if (num>10){
        println("the num is greater")
    }else{
        println("the num is less")
    }
    //if  elseif else statement
    val nambari=69
    if (nambari<0){
        println("its a negative number")
    }else if (nambari>0 && nambari<10)
        println("its a one digit number")
    else if (nambari>10 && nambari<100)
        println("its a double digit number")
    else
        println("it has 3 or more digits")
    }