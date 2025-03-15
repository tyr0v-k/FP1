fun main() {
    var num : Int = 2642
    println("Дней - $num")
    println("Лет: ${num/365}, недель: ${num%365/7}, дней: ${num%365%7}")
}