fun main() {
    println("Bem vindo ao Bytebank!")
//    testaEstruturasRepeticao()

    val contaFulano = Conta()
    contaFulano.titular = "Fulano"
    contaFulano.numero = 1000
    contaFulano.saldo = 100.0
    println(contaFulano.titular)
    println(contaFulano.numero)
    println(contaFulano.saldo)

    println()

    val contaCiclano = Conta()
    contaCiclano.titular = "Ciclano"
    contaCiclano.numero = 1001
    contaCiclano.saldo = 200.0
    println(contaCiclano.titular)
    println(contaCiclano.numero)
    println(contaCiclano.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

//fun testaEstruturasRepeticao() {
//    testaFor()
//    testaForDownTo()
//    testaWhile()
//}
//
//private fun testaWhile() {
//    var i = 0
//    while (i < 5) {
//        println(i)
//        i++
//    }
//}
//
//private fun testaForDownTo() {
//    for (i in 5 downTo 1 step 2) {
//
//        if (i == 3) {
//            break
//        }
//
//        if (i == 1) {
//            continue
//        }
//
//        val titular = "Rodolfo $i"
//        val numeroConta = 1000 + i
//        val saldo = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("saldo: $saldo")
//        testaCondicoes(saldo)
//        println()
//    }
//}
//
//private fun testaFor() {
//    for (i in 1..5) {
//        val titular = "Rodolfo $i"
//        val numeroConta = 1000 + i
//        val saldo = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("saldo: $saldo")
//        testaCondicoes(saldo)
//        println()
//    }
//}
//
//fun testaCondicoes(saldo: Double) {
//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        else -> println("conta é negativa")
//    }
//}