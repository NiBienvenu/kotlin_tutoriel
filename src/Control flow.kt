package src

fun main() {
    /*
    * À l'aide d'une expression when,
    *  mettez à jour le programme suivant afin que lorsque vous entrez les noms des boutons GameBoy,
    *  les actions soient imprimées pour être affichées.
    * */

    // image file /src/control flow image

    val button = "E"

    println(
            when (button) {
                "A" -> {
                    "YES"
                }
                "B" -> {
                    "NON"
                }
                "X" -> {
                    "Menu"
                }
                "Y" -> {
                    "Nothing"
                }
                "Other" ->{
                    "There is no such button"
                }
                else -> {
                    println("Unknown")
                }

        }
    )

    /*
    * Vous avez un programme qui compte les tranches de pizza jusqu'à ce qu'il y ait une pizza entière avec 8 tranches.
    * Refactorisez ce programme de deux manières
    * */
    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    println("======================== 2 WAYS =================")

    for (i in 1..8){
        println("There's only $i slice/s of pizza :(")
    }
    while (pizzaSlices<8){
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    println("======================= 3 WAYS =================")

    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while ( pizzaSlices < 8 )
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")



}