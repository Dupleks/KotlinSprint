package lesson_3

fun main() {
    val morningGreeting = "Доброе утро, "
    val eveningGreeting = "Добрый вечер, "
    val username = "Username"

    var greeting = morningGreeting + username
    println(greeting)

    greeting = eveningGreeting + username
    println(greeting)
}
