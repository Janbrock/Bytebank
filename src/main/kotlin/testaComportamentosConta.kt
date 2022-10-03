fun testaComportamentosConta() {
    val contaFran = ContaCorrente(titular = "Fran", numero = 1000)
    contaFran.deposita(100.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    val contaAlex = ContaPoupanca(numero = 1001, titular = "Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

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
