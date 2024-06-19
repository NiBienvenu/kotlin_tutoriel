package src

fun main() {
    /*
    * À l'aide d'une expression when,
    *  mettez à jour le programme suivant afin que lorsque vous entrez les noms des boutons GameBoy,
    *  les actions soient imprimées pour être affichées.
    * */

    // image file /src/control flow image

    val button = "B"

    println(

            when (button) {
                "A" -> {
                    println("YES")
                }
                "B" -> {
                    println("NON")
                }
                "X" -> {
                    println("Menu")
                }
                "Y" -> {
                    println("Nothing")
                }
                "Other" ->{
                    println("There is no such button")
                }
                else -> {
                    println("Unknown")
                }

        }

    )
}