fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!
    print("Digite seu sexo (M/F): ")
    val sexo = readLine()!!.toUpperCase()
    print("Digite o valor das suas compras: R$")
    val valorCompras = readLine()!!.toFloat()

    val desconto = if (sexo == "F") 0.13 else 0.05
    val valorComDesconto = valorCompras * (1 - desconto)
    println("Olá, $nome! O valor com desconto é R$$valorComDesconto.")
}
