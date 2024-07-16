package src.algorithime


fun main() {
    print("Taper le mois :")
    val mois = readln().toInt()
    print("Taper l'annee :")
    val annee = readln().toInt()

    try {
        when(mois) {
            1->println("Il y a 31 jours dans ce mois.")
            2->{
                if (annee%4==0){
                    println("il y a 29 jours dans ce mois")
                }else{
                    println("il y a 28 jours dans ce mois")
                }

            }
            3->println("il y a 31 jours dans ce mois")
            4->println("il y a 30 jours dans ce mois")
            5->println("il y a 31 jours dans ce mois")
            6->println("il y a 30 jours dans ce mois")
            7->println("il y a 31 jours dans ce mois")
            8-> println("il y a 31 jours dans ce mois")
            9->println("il y a 30 jours dans ce mois")
            10->println("il y a 31 jours dans ce mois")
            11->println("il y a 30 jours dans ce mois")
            12->println("il y a 31 jours dans ce mois")


        }

    }catch (e: Exception) {
        println(e.message)
    }
}