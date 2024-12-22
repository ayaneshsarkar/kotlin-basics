package com.ayanesh.kotlinbasics

fun main() {
  println("Please enter your age:")
  var age = 0
  val expectedOutput = readln()
  age = expectedOutput.toInt()

  if (age in 25..100) {
    println("You are adult.")
  } else {
    println("You're just another kid.")
  }
}