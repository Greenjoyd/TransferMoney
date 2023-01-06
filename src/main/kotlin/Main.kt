import jdk.jfr.DataAmount
import java.util.Scanner

fun main(args: Array<String>) {
    calculation()
}
fun calculation(
    typeOfCard : String = "VK Pay",
    amount: Int =90_000,
): Int {
    var commision = (amount / 100) * 0.75
    var summ = 0//Сумма переводов
    when (typeOfCard) {
        "VK Pay" -> commision = 0.0
        "Visa" -> if (commision > 35) {
            commision = commision
        } else commision = 35.0

        "Мир" -> if (commision > 35) {
            commision = commision
        } else commision = 35.0

        "Mastercard" -> if (summ < 75000) {
            commision = 0.0
        } else commision = 20 + (amount / 100) * 0.6

        "Maestro" -> if (summ < 75000) {
            commision = 0.0
        } else commision = 20 + (amount / 100) * 0.6
    }
    println("Сумма перевода: " + amount + " рублей")
    println("Комиссия: " + commision.toInt() + " рублей")
    return amount
    return commision.toInt()

}