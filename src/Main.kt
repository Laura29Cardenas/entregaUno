class Constants {
    companion object {
        const val VERSION_CODE = 1.2
    }
}

var userAge: Int? = 25

fun greetUser(userName: String, greetingMessage: String = "Hola") {
    println("$greetingMessage $userName")
}

fun main() {
    val itemCount: Int = 5
    println("El número de elementos es: $itemCount")

    var userFirstName: String = "Ana"
    userFirstName = "Elena"
    println("El nombre del usuario es: $userFirstName")

    println("La versión actual del software es: ${Constants.VERSION_CODE}")

    greetUser("Karol")
    greetUser("Laura", "Hi")
    greetUser("Mary")

    if (userAge != null) {
        println("La edad del usuario es $userAge años")
    } else {
        println("La edad del usuario no está definida")
    }
}
