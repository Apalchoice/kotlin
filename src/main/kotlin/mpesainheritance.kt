open class Mpesaaccount(val phoneno:String, var balance:Double){
    fun deposit(amount:Double) {
        if (amount > 0) {
            balance+=amount
            println("deposited $amount into account $phoneno new balance $balance")
        }else{
            println("invalid deposit")
        }
    }
open fun withdrwan(amount: Double){
    if (amount>0 && amount<=balance){
        println("withdrawn $amount from account $phoneno.balance:$balance")
}else {
        println("insufficient balance")
    }
}
}
class checkbalance(phoneno: String,balance: Double):Mpesaaccount(phoneno,balance) {
    fun sendmoney(receiverphone: String, amount: Double) {
        if (amount > 0 && amount <=0){
            balance=-amount
            println("sent $amount to account $receiverphone.Balance:$balance")
    }else{

        println("insufficient balance")
      }
     }
}
   fun main(args: Array<String>){
    val useraccoount = checkbalance("0748877019", 200.0)
    val receiveraccount = checkbalance("074770182", 1000.00)
    useraccoount.deposit(560.0)
    useraccoount.withdrwan(350.0)
    useraccoount.sendmoney(receiveraccount.phoneno,50.0)
    }



