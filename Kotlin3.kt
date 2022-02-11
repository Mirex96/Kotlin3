// 3. Написать функцию, которая проверяет больше ли первое число второго и возвращает Boolean
fun main() {
    val number1 = 5
    val number2 = 4
    println(check(number1, number2))
}

fun check(number1: Int, number2: Int): Boolean {
    return number1 > number2

}