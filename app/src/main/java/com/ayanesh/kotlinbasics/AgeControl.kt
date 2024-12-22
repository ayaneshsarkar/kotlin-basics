package com.ayanesh.kotlinbasics

fun main() {
  print("Enter your age as a whole number: ")
  var age = 0

  val expectedOutput = readln()
  age = expectedOutput.toInt()

  if (age in 18..<40) {
    print("You can enter the club.")
  } else if (age >= 40) {
    print("You cannot go into the club, please go home.")
  } else {
    print("Age not verified. Please contact support.")
  }
}