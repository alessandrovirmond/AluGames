package br.com.alura.alugames.modelo

data class Gamer(var nome: String, var email:String){
    var dataNascimento: String? = null
    var usuaio: String? = null
    val idIntrno:String? = null

    constructor(nome: String, email: String, dataNascimento: String, usuario: String): this(nome,email){
        this.dataNascimento = dataNascimento
        this.usuaio = usuaio

    }

    override fun toString(): String {
        return "Gamer(nome='$nome', email='$email', dataNascimento=$dataNascimento, usuaio=$usuaio, idIntrno=$idIntrno)"
    }

}
