package com.example

fun String.hello() = "Hi, $this"

fun main() {
    println("Alice".hello())
}