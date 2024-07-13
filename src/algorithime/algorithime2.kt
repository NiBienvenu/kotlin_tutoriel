package src.algorithime

fun main() {
    print("Tapper un entier e : ")
    var x =1
    var e =1
    try {
         e = readln().toInt()
        do {
            print("Taper un entier positif x : " )
             x = readln().toInt()
        }while (x <= 0)

        var i: Int = 0
        var prod =1
        for (i in 1..x){
            prod *= e
        }
        println(" l'exposant de e^x : ${prod}")
    }catch (e: Exception) {

    }




}