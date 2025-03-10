fun main() {
println("Digite o salario:")
var sal = readLine()!!.toDouble()
var aumento = sal * 0.15
var novo_sal = sal + aumento
println("Seu novo salário é: R$ $novo_sal")
}
