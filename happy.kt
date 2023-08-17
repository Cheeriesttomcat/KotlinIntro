fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border,timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border,timesToRepeat)
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printBorder(border: String, times: Int) {
    repeat(times) {
        print(border)
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers){
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}
