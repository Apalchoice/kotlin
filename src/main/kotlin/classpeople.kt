class people(val name:String, val age:Int, val gender: String){
//    member function for intro
    fun jitambulishe (){
        println("hi my name is $name and im $age years old $gender")

    }
//    member function to have a birthday
    fun birthday(){
        //age++
        println("$name just turned $age years old")
    }
}

fun main(args: Array<String>) {
    //create an instance of objects of a class
    val watu=people("john", 45,"male")
    val watu1=people("grace", 45,"female")
    val watu2=people("liz", 45,"female")

    watu.jitambulishe()
    watu.birthday()
    watu1.jitambulishe()
    watu1.birthday()
    watu2.jitambulishe()
    watu2.birthday()
}