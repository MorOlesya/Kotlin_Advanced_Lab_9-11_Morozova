package payment


fun main() {
//    val processor = PaymentProcessor()
//    val payments = listOf(
//        Payment("4_111_111_111_11", 1000, CardType.VISA),
//        Payment("5_111_111_111_11", 2000, CardType.MASTERCARD),
//        Payment("2_222_222_222_22", 1500, CardType.MIR),
//        Payment("1234567812345678", 500, CardType.UNKNOWN),
//        Payment("123", 500, CardType.UNKNOWN)
//    )
//    println("=== Обработка платежей ===")
//    payments.forEach { payment ->
//        println("\nПлатёж ${payment.type}: ${payment.card.take(4)}..., ${payment.sum} руб.")
//        val result = processor.pay(payment)
//        processor.show(result)
//    }
//
//    println("\n=== Работа с enum ===")
//    val cardType = CardType.VISA
//    println("Тип карты: $cardType")
//    println("Порядковый номер: ${cardType.ordinal}")
//    println("Все типы карт: ${CardType.values().joinToString()}")

    val payment1 = Payment("4111111111111111", 1000, CardType.VISA)
    val payment2 = payment1.copy(type = CardType.MASTERCARD, sum = 2000)

    println("\n=== Сравниваем data class ===")
    println("Платёж 1: $payment1")
    println("Платёж 2: $payment2")
    println("Одинаковые? ${payment1 == payment2}")
}