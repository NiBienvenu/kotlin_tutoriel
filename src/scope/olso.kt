data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    p.let {
        println("creation log created age ${p.age} ${p.about}")
    }
    println("A new person ${p.name} was created.")
}

fun main() {
        val jake = Person("Bienvenu", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}