fun main() {
    println("Bem vindo ao Bytebank!")

    val contaCorrente = ContaCorrente(
        "Alex",
        1000
    )
    val contaPoupanca = ContaPoupanca(
        "Fran",
        1001
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)
    println("saldo após depósito na Poupança: ${contaPoupanca.saldo}")
    println("saldo após depósito na Corrente: ${contaCorrente.saldo}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)
    println("saldo após saque na Poupança: ${contaPoupanca.saldo}")
    println("saldo após saque na Corrente: ${contaCorrente.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("saldo após transferência na Poupança: ${contaPoupanca.saldo}")
    contaCorrente.transfere(50.0, contaPoupanca)
    println("saldo após transferência na Corrente: ${contaCorrente.saldo}")

}



