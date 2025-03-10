fun main() {
   val vetor = IntArray(10) { 9 - it }
  println(vetor.joinToString(" "))
  println((0..9).joinToString(" ") { it.toString().padStart(2, ' ') })
} 
