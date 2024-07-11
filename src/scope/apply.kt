data class Personne(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {

    /*
    *apply exécute un bloc de code sur un objet et renvoie l'objet lui-même.
    *  A l'intérieur du bloc, l'objet est référencé par this. Cette fonction est pratique pour initialiser des objets. 1

    *
    * */

    val jake = Personne()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription)
}