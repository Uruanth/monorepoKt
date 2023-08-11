package co.com.pragma.domain


data class User(
    val id: Int,
    val name: String
) {
    constructor(): this(0,"none")
}