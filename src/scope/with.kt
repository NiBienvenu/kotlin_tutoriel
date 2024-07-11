class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    /*
    * with est une fonction sans extension qui peut accéder aux membres de son argument de manière concise
    * : vous pouvez omettre le nom de l'instance lorsque vous faites référence à ses membres. 1
    *
    * */
    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}