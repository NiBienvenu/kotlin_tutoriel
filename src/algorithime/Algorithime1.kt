package src.algorithime


fun main() {
    print("Taper un entier: ")

    try {
        val number = readln().toInt()
        if (number%2 ==0){
            print("le nombre est paire")
        }else{
            print("le nombre n'est pas paire")
        }
    }catch (e: Exception) {
        println(e.message)
    }
}