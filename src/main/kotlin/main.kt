fun main() {

    val discountStart = 12_000
    val discount1Level = 100
    val discount2Level = 0.95
    val buy = 800
    val musicLover = false

    val totalPrice: Int = if (discountStart in 1001..10000) {
        buy - discount1Level
    } else if (discountStart in 10001..Int.MAX_VALUE) {
        ((buy * discount2Level).toInt())
    } else
        buy

    val result = if (musicLover)  (totalPrice * 0.99) else totalPrice

    println( "Итоговая сумма покупки составляет $result руб")
}