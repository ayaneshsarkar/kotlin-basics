package com.ayanesh.kotlinbasics

fun main() {
  println("Please enter a number: ")
  val inputString = readln()
  val inputNumber = inputString.toInt()

  val multiplier = 5
  val operatedValue = inputNumber * multiplier
  println("Result of operation is: $operatedValue")
}