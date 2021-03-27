fun main() {
    println("Bem vindo ao Bytebank!")
    val titular = "Rodolfo Ghiggi"
    val numeroConta = 1000
    var saldo = 100 + 2.0
    saldo += 200

    println("titular: $titular")
    println("número da conta: $numeroConta")
    println("saldo: $saldo")

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}