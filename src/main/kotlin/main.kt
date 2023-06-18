package ru.netology

fun main(){
    val likes = 2311

    val people = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $people")
}