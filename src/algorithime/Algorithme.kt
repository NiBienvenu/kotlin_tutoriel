package src.algorithime

fun main() {
    println("Taper un entier")
    try {
        val num = readln().toInt()
           var i = 1
        var multipl: Int = 0

               while (multipl < 100) {
                   multipl = num*i
                   println("Number : $multipl")
                   i++;
               }
    }catch (_: Exception){
        println("Error de   convert to integer")
    }

}