package src

fun main() {

    /*
    * Vous avez une liste de numéros « verts » et
    * une liste de numéros « rouges ».
    *  Complétez le code pour imprimer le nombre total de numéros.
    * */

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println(greenNumbers.size + redNumbers.size)

    /* * Vous disposez d'un ensemble de protocoles pris en
    charge par votre serveur. * Un utilisateur demande à utiliser
     un protocole particulier. * Terminez le programme pour vérifier
     si le protocole demandé est supporté ou non (isSupported doit être une
     valeur booléenne).
      * */

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
//    val isSupported = SUPPORTED.contains(requested.uppercase())// Write your code here
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

    /*
    * Définissez une carte qui associe les nombres entiers de 1 à 3 à
    * leur orthographe correspondante. Utilisez cette carte pour épeler le nombre donné
    * */

    val card = mapOf(1 to "one", 2 to "two", 3 to "three")
    val number = 2

    println("$number is spelt as '${card[number]}'")



}