package exercises.`01_Basics`.`01_Hello_World`.exercise_01_hello_greetings

class Solution {

    fun solution(name:String?) {
        println("Hello, $name! Welcome to Kotlin Basics.")
    }
}


fun main() {

    println("Please enter your name: ")
    val name:String? = readLine()
}
