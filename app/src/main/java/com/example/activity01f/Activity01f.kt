package com.example.activity01f

fun main() {
    println("Enter the first string:")
    val input1 = readLine()?.trim() ?: ""

    println("Enter the second string:")
    val input2 = readLine()?.trim() ?: ""

    val unionSet = mutableSetOf<Char>()

    for (char in input1) {
        if (char !in unionSet) {
            unionSet.add(char)
        }
    }

    for (char in input2) {
        if (char !in unionSet) {
            unionSet.add(char)
        }
    }

    println("Union of unique characters in both strings:")
    println(unionSet.joinToString(""))
}

