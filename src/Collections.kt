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

    /*
    * 1. Creates a Set with given elements.
      2. Returns a boolean value showing if the element was actually added.
      3. Returns a string, based on function input parameter.
      4. Prints a success message: the new element is added to the Set.
      5. Prints a failure message: the element can't be added because it duplicates an existing element.
    * */



        val aNewIssue: String = "uniqueDescr4"
        val anIssueAlreadyIn: String = "uniqueDescr2"
        val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

        fun addIssue(uniqueDesc: String): Boolean {
            return openIssues.add(uniqueDesc)                                                             // 2
        }

        fun getStatusLog(isAdded: Boolean): String {
            return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
        }

        println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
        println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5

        /*
        *
        * Creates a mutable Map.
        Creates a read-only view of the Map.
        Checks if the Map's key exists.
        Reads the corresponding value and increments it with a constant value.
        Iterates immutable Map and prints key/value pairs.
        Reads the account points balance, before updates.
        Updates an existing account two times.
        Tries to update a non-existing account: prints an error message.
        Reads the account points balance, after updates.
        *
        * */

    val POINTS_X_PASS: Int = 15
    val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
    val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

    fun updatePointsCredit(accountId: Int) {
        if (EZPassAccounts.containsKey(accountId)) {                                        // 3
            println("Updating $accountId...")
            EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
        } else {
            println("Error: Trying to update a non-existing account (id: $accountId)")
        }
    }

    fun accountsReport() {
        println("EZ-Pass report:")
        EZPassReport.forEach {                                                              // 5
                k, v -> println("ID $k: credit $v")
        }
    }


        accountsReport()                                                                    // 6
        updatePointsCredit(1)                                                               // 7
        updatePointsCredit(1)
        updatePointsCredit(5)                                                               // 8
        accountsReport()                                                                    // 9

    /*
    * Defines collection of numbers.
    Gets positive numbers.
    Uses the shorter it notation to get negative numbers.
        *
    * */

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val numberss = listOf(1, -56, 3, -4, 5, -6) // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3


    /*
    * Defines a collection of numbers.
        Doubles numbers.
        Uses the shorter it notation to triple the numbers.
            *
            *
    * */
    val numb = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numb.map { x -> x * 2 }      // 2

    val tripled = numb.map { it * 3 }          // 3

    println("Numbers: $numb")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")

    // booucle avec map
    numberss.map {
        println(it)
    }

    /*
    * Defines a collection of numbers.
    Checks if there are negative elements.
    Checks if there are elements greater than 6.
    * */

    val numbedfrs = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbedfrs.any { it < 0 }             // 2

    val anyGT6 = numbedfrs.any { it > 6 }                  // 3

    println("Numbers: $numbedfrs")
    println("Is there any number less than 0: $anyNegative")

    println("Is there any number greater than 6: $anyGT6")


    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }                                // 2
    val last = words.findLast { it.startsWith("some") }                             // 3

    val nothing = words.find { it.contains("nothing") }                             // 4

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")

    val wordss = listOf("foo", "bar", "baz", "faz")         // 1
    val emptyy = emptyList<String>()                        // 2

    val firstt = emptyy.firstOrNull()                        // 3
    val lastt = emptyy.lastOrNull()                          // 4

    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
    val lastZ = words.lastOrNull { it.endsWith('z') }      // 8


    val numbe = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbe.count()
    println(totalCount)// 2
    val evenCount = numbe.count { it % 2 == 0 }        // 3
}
