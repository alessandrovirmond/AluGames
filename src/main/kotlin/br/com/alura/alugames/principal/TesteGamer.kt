import br.com.alura.alugames.modelo.Gamer
fun main() {
    val gamer1 = Gamer(nome: "Jaque", email: "jaque@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        nome: "Jeni",
    email: "jeni@email.com",
    dataNascimento: "19/19/1992",
        usuario: "jeniblo")

    println(gamer2)
}