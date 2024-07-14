package src.algorithime

fun main() {
    try {
        println("Entre le premier nombre : ")
        val numbr1 = readln().toInt()
        println("Entre le second nombre : ")
        val number2 = readln().toInt()

        if (numbr1<number2){
            println("le nombre 1 es inferieur a nombre 2")
        }else if(numbr1>number2){
            println("le nombre 1 est superieur a nombre 2")
        }else{
            println("le nombre 1 est egale a nombre 2")
        }
    }catch (e:Exception){
        println(e.message)
    }
}