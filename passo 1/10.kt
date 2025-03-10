fun main() {
println("Digite a largura: ")
var largura = readLine()!!.toDouble()
println("Digite a altura: ")
var altura = readLine()!!.toDouble()
val area = altura * largura
println("A área a ser pintada é de $area metros quadrados")
println("E sera necessário ${area / 2} litros de tinta")

}
