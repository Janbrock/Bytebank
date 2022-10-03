fun main() {
    println("Bem vindo ao Bytebank!")
    val contaFran = Conta()
    val contaAlex = Conta()

    contaFran.titular = "Fran"
    contaFran.numero = 1000
    contaFran.setSaldo(100.0)

    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.setSaldo(50.0)

    println("Depósito na conta da Fran")
    contaFran.deposita(100.0)
    println(contaFran.getSaldo())

    println("Saque na conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.getSaldo())

    println("Transferência da conta da Fran para a do Alex")
    if (contaFran.transfere(50.0, contaAlex)) {
        println("Transferência bem sucedida!")
    } else {
        println("Falha na transferência!")
    }
    println("Saldo da conta da Fran: ${contaFran.getSaldo()}")
    println("Saldo da conta da Alex: ${contaAlex.getSaldo()}")
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
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

    fun getSaldo(): Double {
        return saldo
    }
    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor
        }
    }
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
