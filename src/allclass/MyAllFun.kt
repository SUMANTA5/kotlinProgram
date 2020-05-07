package allclass

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
            }
            else -> {
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

    fun leapYear(year: Int) {
        if ((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0)) {
            println("LeapYear")
        } else {
            println("Not LeapYear")
        }
    }

    fun textType(text: String) {
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

    fun weekDay(weekNumber: Int) {
        when (weekNumber) {
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

    fun numberOfDaysInThatMonth(monthNumber: Int) {
        when (monthNumber) {
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

    fun triangleIsValidOrNot(angles1: Int, angles2: Int, angles3: Int) {
        if (angles1 + angles2 + angles3 == 180) {
            println("Triangle Is Valid")
        } else {
            println("Triangle Is Not Valid")
        }
    }

    fun whatIsYourGrade(percentage: Int) {
        when (percentage) {
            in 100 downTo 90 -> println("Grade (A)")
            in 89 downTo 80 -> println("Grade (B)")
            in 79 downTo 70 -> println("Grade (c)")
            in 69 downTo 60 -> println("Grade (D)")
            in 59 downTo 40 -> println("Grade (E)")
            else -> println("Grade (F)")
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

    fun evenOddInWhen(number: Int) {
        when (number % 2 == 0) {
            true -> println("Is Even")
            false -> println("Is Odd")
        }
    }

    fun calculator(num1: Int, num2: Int, sign: String) {
        when (sign) {
            "+" -> println("Addition:${num1 + num2}")
            "-" -> println("Subtraction:${num1 - num2}")
            "*" -> println("Multiplication:${num1 * num2}")
            "/" -> println("Division:${num1 / num2}")
        }
    }

    //Loop//
    fun printNumber(n: Int) {
        for (i in 1..n) {
            println(i)
        }
    }

    fun printNumberReverse(n: Int) {
        for (i in n downTo 1) {
            println(i)
        }
    }

    fun alphabetsAtoZ() {
        for (i in 'A'..'Z') {
            println(i)
        }
    }

    fun evenNumber1ton(n: Int) {
        for (i in 1..n) {
            if (i % 2 == 0)
                println("$i Even Number")
        }
    }

    fun oddNumber1ton(n: Int) {
        for (i in 1..n) {
            if (i % 2 != 0)
                println("$i Odd Number")
        }
    }

    fun sumOfAllNaturalNumber(n: Int) {
        var number = 0
        for (i in 1..n) {
            number += i
        }
        println(number)
    }

    fun sumEvenNumber1ton(n: Int) {
        var number = 0
        for (i in 1..n) {
            if (i % 2 == 0)
                number += i
        }
        println(number)
    }

    fun sumOddNumber1ton(n: Int) {
        var number = 0
        for (i in 1..n) {
            if (i % 2 != 0)
                number += i
        }
        println(number)
    }

    fun multiplicationTable(yourNumber: Int, n: Int) {
        for (i in 1..n) {
            println("${yourNumber * i}")
        }
    }

    fun countNumber() {
        var number = 1020
        var count = 0
        while (number != 0) {
            count++
            number /= 10
        }
        println(count)
    }

    fun firstAndLastDigits(number: Int) {
        val last = number % 10
        var n = number
        while (n >= 10) {
            n /= 10
        }
        val first = n
        println("first digits $first")
        println("last digits $last")
    }

    fun sumFirstAndLastDigits(number: Int) {
        val last = number % 10

        var n = number
        while (n >= 10) {
            n /= 10
        }
        val first = n
        val sum = last + first
        println("first digits: $first")
        println("last digits: $last")
        println("Sum of first and last digits: $sum")
    }

    fun swapFirstAndLastDigits(number: Int) {
        val last = number % 10
        var n = number
        while (n >= 10) {
            n /= 10
        }
        val first = n
        println("first digits: $first")
        println("last digits: $last")
        var f = first
        var l = last
        f += l
        l = f - l
        f -= l
        println("Swap first and last digits: $f , $l")
    }

    fun sumOfDigits(number: Int) {
        var sum = 0
        var n = number
        while (n != 0) {
            sum += n % 10
            n /= 10
        }
        println("Sum Of Digits: $sum")
    }

    fun productOfDigits(number: Int) {
        var p = 1
        var n = number
        while (n != 0) {
            p *= (n % 10)
            n /= 10
        }
        println("Product of digits a number: $p")
    }

    fun reverse(number: Int) {
        var n = number
        var reverseNumber = 0
        var r: Int
        while (n != 0) {
            r = n % 10
            reverseNumber = reverseNumber * 10 + r
            n /= 10
        }
        println("Reverse Number Is: $reverseNumber")
    }

    fun palindromeOfNumber(number: Int) {
        var n = number
        var reverseNumber = 0
        var r: Int
        while (n != 0) {
            r = n % 10
            reverseNumber = reverseNumber * 10 + r
            n /= 10
        }
        if (number == reverseNumber) {
            println("it palindrome number")
        } else println("it not palindrome number")
    }

    fun frequency(number: Int) {
        var count = 0
        var n = number
        while (n != 0) {
            n /= 10
            count++
        }
        println("frequency of each digits: $count")
    }

    fun numberToWords(number: Int) {
        var n = number
        var reverseNumber = 0
        while (n != 0) {
            reverseNumber = (reverseNumber * 10) + (n % 10)
            n /= 10
        }
        while (reverseNumber != 0) {
            when (reverseNumber % 10) {
                0 -> print("zero")
                1 -> print("one")
                2 -> print("two")
                3 -> print("three")
                4 -> print("for")
                5 -> print("five")
                6 -> print("six")
                7 -> print("seven")
                8 -> print("eight")
                9 -> print("nine")
            }
            reverseNumber /= 10
        }
    }

    fun factors(number: Int) {
        for (i in 1..number) {
            if (number % i == 0) println(i)
        }
    }

    fun factorial(number: Int) {
        var factorial = 1
        for (i in 1..number) {
            factorial *= i
        }
        println(factorial)
    }

    fun primeNumber(number: Int) {
        var flag: Boolean = true
        for (i in 2..number - 1) {
            if (number % i == 0) {
                flag = false
                break
            }
        }
        if (flag)
            println("prime")
        else
            println("not prime")
    }

    fun primeNumber1Ton(n: Int) {
        for (j in 1..n) {
            var flag: Boolean = true
            for (i in 2..j - 1) {
                if (j % i == 0) {
                    flag = false
                    break
                }
            }
            if (flag == true)
                println("prime:$j")
        }
    }

    fun sumOfPrimeNumber1Ton(n: Int) {
        var sum = 0
        for (j in 1..n) {
            var flag: Boolean = true
            for (i in 2..j - 1) {
                if (j % i == 0) {
                    flag = false
                    break
                }
            }
            if (flag == true)
                sum += j
        }
        println("sum of Prime number:$sum")
    }

    fun factorsOfPrimeNumber1Ton(n: Int) {
        for (j in 1..n) {
            var flag: Boolean = true
            for (i in 2 until j) {
                if (j % i == 0) {
                    flag = false
                    break
                }
            }
            if (flag)
                if (n % j == 0)
                    println(j)
        }
    }

    fun armstrong(number: Int) {
        var num = number
        var lastNumber: Int
        var sum = 0
        while (num != 0) {
            lastNumber = num % 10
            sum += lastNumber * lastNumber * lastNumber
            num /= 10
        }
        if (sum == number)
            println("Armstrong Number")
        else
            println("Is Not Armstrong Number")
    }

    fun armstrong1Ton(number: Int) {
        var lastNumber: Int
        var sum: Int
        var a: Int
        for (i in 1..number) {
            a = i
            sum = 0
            while (a != 0) {
                lastNumber = a % 10
                sum += lastNumber * lastNumber * lastNumber
                a /= 10
            }
            if (i == sum)
                println(sum)
        }
    }

    fun perfect(number: Int) {
        var sum = 0
        for (i in 1..number / 2) {
            if (number % i == 0) {
                sum += i
            }
        }
        if (sum == number)
            println("is perfect: $sum")
        else
            println("is not perfect: $sum")

    }

    //StarPattern
    fun squareStarPattern() {
        val rows = 5
        for (i in 1..rows) {
            for (j in 1..rows) {
                print("* ")
            }
            println()
        }
    }

    fun hollowSquareStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i == 1 || i == rows || j == 1 || j == column)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun rightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j <= i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun hollowRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j == 1 || j == i || i == 5)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun mirroredRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j >= 6 - i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun hollowMirroredRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j == 5 || i == 5 || j + i == 6)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun invertedRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j <= 6 - i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun hollowInvertedRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i == 1 || j == 1 || i + j == 6)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun invertedMirroredRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i <= j)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun hollowInvertedMirroredRightTriangleStarPattern() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i == 1 || j == 5 || i == j)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun pyramidStarPattern() {
        val rows = 5
        val column = 9
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j >= 6 - i && j <= 4 + i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun hollowPyramidStarPattern() {
        val rows = 5
        val column = 9
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i == 5 || j == 6 - i || j == 4 + i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    fun invertedPyramidStarPattern() {
        val rows = 5
        val column = 9
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j >= 0 + i && j <= 10 - i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }


}