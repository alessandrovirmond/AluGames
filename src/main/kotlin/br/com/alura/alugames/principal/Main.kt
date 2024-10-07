package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Jogo
import br.com.alura.alugames.servicos.ConsumoApi
import java.util.*


fun main() {

    val leitura = Scanner(System.`in`)
    println("Digite um codigo do jogo para buscar: ")
    val busca = leitura.nextLine()

    val buscaApi = ConsumoApi()

    val informacaoJogo = buscaApi.buscaJogo(busca)

    var meuJogo: Jogo? = null

    val resultado = runCatching {
        meuJogo = Jogo(
            informacaoJogo.info.title,
            informacaoJogo.info.thumb
        )
    }

    resultado.onFailure {
        println("Jogo inexistente")
    }

    resultado.onSuccess {
        println("Deseja inserir uma descrição personalizada? S/N")
        val opcao = leitura.nextLine()
        if(opcao.equals("s", true)){
            println("Insira a descricao: ")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        } else {
            meuJogo?.descricao = meuJogo?.titulo
        }

        println(meuJogo)
    }

}