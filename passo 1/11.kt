fun main() {
println("Digite o valor de A:")
val A = readLine()!!.toDouble()

println("Digite o valor de B:")
val B = readLine()!!.toDouble()

println("Digite o valor de C:")
val C = readLine()!!.toDouble()

val delta = (B * B) - (4 * A * C)
println("O valor de Delta é $delta")

}
