package allclass
import sun.awt.geom.Crossings
class MyAllFun {

     //IfElse


    fun negativePositiveZero(a: Int) {
        when {
            a > 0 -> {
                println("Positive")
            }
            a < 0 -> {
                println("Negative")
            }
            a == 0 -> {
                println("Zero")
            } else -> {
            println("it not number")
            }
        }
    }
    fun max(a: Int, b: Int, c: Int): Int {
        if (a > b) {
            return if (a > c) {
                a
            } else c
        }
        return if (b > c) {
            b
        } else c
    }
    fun evenOdd(number: Int) {
        if (number % 2 == 0) {
            println("it Even")
        } else {
            println("it Odd")
        }
    }
    fun vowelConsonent(vowel: Char) {

            if ((vowel == 'a') ||
                (vowel == 'e') ||
                (vowel == 'i') ||
                (vowel == 'o') ||
                (vowel == 'u')) {
               println("Vowel")
            } else {
            println("Consonent")
           }
    }
    fun leapYear(year: Int){
        if ((year % 4==0) && (year % 100 == 0 ) || (year % 400 == 0)){
            println("LeapYear")
        }else{
            println("Not LeapYear")
        }
    }
    fun textType(text: String){
        when (text) {
            in "a".."z" -> {
                println("it Alphabet")
            }
            in "0".."9" -> {
                println("it Digit")
            }
            else -> {
                println("Special Character")
            }
        }
    }
    fun upperLower(text: String) {
        when (text) {
            in "A".."Z" -> println("Uppercase")
            in "a".."z" -> println("Lowercase")
            else -> println("is not a text")
        }

    }
    fun weekDay(weekNumber: Int){
        when(weekNumber){
            1 -> println("Mon")
            2 -> println("Tue")
            3 -> println("Wed")
            4 -> println("Thu")
            5 -> println("Fri")
            6 -> println("Sat")
            7 -> println("Sun")
            else -> println("it not day of week")
        }
    }
    fun numberOfDaysInThatMonth(monthNumber: Int){
        when(monthNumber){
            1 -> println("31")
            2 -> println("29")
            3 -> println("31")
            4 -> println("30")
            5 -> println("31")
            6 -> println("30")
            7 -> println("31")
            8 -> println("31")
            9 -> println("30")
            10 -> println("31")
            11 -> println("30")
            12 -> println("31")
            else -> println("number is not valid")
        }
    }
    fun triangleIsValidOrNot(angles1: Int, angles2: Int, angles3: Int ){
        if (angles1 + angles2 + angles3 == 180){
            println("Triangle Is Valid")
        }else {
            println("Triangle Is Not Valid")
        }
    }
   fun whatIsYourGrade(percentage: Int){
       when(percentage){
           in 100 downTo 90 -> println("Grade (A)")
           in 89 downTo 80 -> println("Grade (B)")
           in 79 downTo 70 -> println("Grade (c)")
           in 69 downTo 60 -> println("Grade (D)")
           in 59 downTo 40 -> println("Grade (E)")
           else ->  println("Grade (F)")
       }
   }


    //when//


    fun maxTwoNumber(num1: Int, num2: Int) {
        when {
            num1 > num2 -> println("max:${num1}")
            num2 > num1 -> println("max:${num2}")
            else -> println("This number is not max")
        }
    }
    fun evenOddInWhen(number: Int){
        when(number%2==0){
            true-> println("Is Even")
            false-> println("Is Odd")
        }
    }
    fun calculator(num1: Int,num2: Int, sign:String){
        when(sign){
           "+" -> println("Addition:${num1+num2}")
           "-" -> println("Subtraction:${num1-num2}")
           "*" -> println("Multiplication:${num1*num2}")
           "/"-> println("Division:${num1/num2}")
        }
    }

    //Loop//
}