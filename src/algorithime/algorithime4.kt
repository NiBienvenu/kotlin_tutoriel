package src.algorithime

import java.util.ArrayList

fun main() {
    do {
        print("Enter le nombre positif 2 : ")
        val number = readln().toInt()
        print("Enter le nombre positif 2 : ")
        val  number2 = readln().toInt()
        if (number2 == number){
            println("Le PGCD est : $number2")
        return
        }
        var list : ArrayList<Int> = ArrayList()
        var list2 : ArrayList<Int> = ArrayList()

        for (i in 2.. (number/2)){
            if (number%i == 0)
                list.add(i)
        }
        for (i in 2.. (number2/2)){
            if (number%i == 0)
                list2.add(i)
        }
        list.reverse()
        list2.reverse()
        for ((value , index) in list.withIndex()){
            if (value == list2[index]) {
                println("Le PGCD de deux nombre est : ${value}")
                return
            }
        }

    }while (number<0 && number2<0)
}