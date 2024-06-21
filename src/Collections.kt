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

    /*
    *   1.Creates a MutableList.
        2.Creates a read-only view of the list.
        3.Adds a new item to the MutableList.
        4. function that returns an immutable List.
        5.Updates the MutableList. All related read-only views are updated as well since they point to the same object.
        6.Retrieves the size of the read-only list.
        7.Iterates the list and prints its elements.
        8.Attempting to write to the read-only view causes a compilation error.
    *
    * */

    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
    val sudoers: List<Int> = systemUsers                              // 2

    fun addSystemUser(newUser: Int) {                                 // 3
        systemUsers.add(newUser)
    }

    fun getSysSudoers(): List<Int> {                                  // 4
        return sudoers
    }


        addSystemUser(4)                                              // 5
        println("Tot sudoers: ${getSysSudoers().size}")               // 6
        getSysSudoers().forEach {                                     // 7
                i -> println("Some useful info on user $i")
        }
        // getSysSudoers().add(5) <- Error!                           // 8



}