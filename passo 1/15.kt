fun main() {
println("Digite o número de dias trabalhados no mes: ")
var num_dias = readLine()!!.toInt()
var num_horas = num_dias * 8
var salario = num_horas * 25
println("O salário é de R$ $salario")

}
