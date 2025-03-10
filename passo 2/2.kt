fun main() {
    println("Digite o ano de nascimento")
    var ano = readLine()!!.toInt()
    var idade = 2025 - ano
    if (idade < 18){
        println("Você não pode votar!")
    } else {
        println("Você já pode votar!")
    }
}
