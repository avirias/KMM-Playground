package me.avirias.shared

expect class Platform() {
    val platform: String
}

expect fun helloWorld(): String