fun main(args: Array<String>) {
    var ch='b'
    var num1=30
    when (ch){
        'a'-> println("a is A vowel")
        'e'-> println("e is A vowel")
        'i'-> println("i is A vowel")
        'o'-> println("o is A vowel")
        'u'-> println("u is A vowel")
        else -> println("$ch is a consonant")

    }
    when (num1){
        in 1..9-> println("its a  single digit number")
        in 10..99-> println("its a  double digit number")
        in 100..999-> println("its a  triple digit number")
        else -> println("has more than three digits")
    }
}