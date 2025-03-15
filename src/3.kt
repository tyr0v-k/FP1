fun main() {
    var num = readln()
    while (num.toInt() !in 1000..9999){ num = readln() }
    println(num.toCharArray().joinToString (", "))
}