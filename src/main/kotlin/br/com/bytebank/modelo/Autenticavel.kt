package br.com.bytebank.modelo

interface Autenticavel {
    fun autentica(senha:Int): Boolean
}