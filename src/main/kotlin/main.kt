fun main() {
    println("Bem vindo ao Bytebank!")

    val contaFran = Conta("Fran", 1000)
    contaFran.deposita(100.0)

    val contaAlex = Conta("Alex", 1001)
    contaAlex.deposita(50.0)

    println("Depósito na conta da Fran")
    contaFran.deposita(-200.0)
    println(contaFran.saldo)

    println("Saque na conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para a do Alex")
    if (contaFran.transfere(50.0, contaAlex)) {
        println("Transferência bem sucedida!")
    } else {
        println("Falha na transferência!")
    }
    println("Saldo da conta da Fran: ${contaFran.saldo}")
    println("Saldo da conta da Alex: ${contaAlex.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false


    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
}

//fun testaLaços() {
//    var i = 0
//    while (i < 5) {
//        val titular = "Alex $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//        i++
//
//        println("Titular: $titular")
//        println("Número da conta: $numeroConta")
//        println("Saldo: $saldo")
//        println()
//    }
//
//
//}

//fun testaCondicoes(saldo: Double) {
//    when {
//        saldo > 0.0 -> println("Conta é positiva!")
//        saldo == 0.0 -> println("Conta é neutra!")
//        else -> println("Conta é negativa!")
//    }
//}
