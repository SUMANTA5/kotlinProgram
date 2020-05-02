package allclass
import sun.awt.geom.Crossings
class allClassIfElse {
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

}