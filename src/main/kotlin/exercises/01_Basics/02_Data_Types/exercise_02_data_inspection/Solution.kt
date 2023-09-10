package exercises.`01_Basics`.`02_Data_Types`.exercise_02_data_inspection

class Solution {

    fun solution(name:String?):String = when{
            name?.toBooleanStrictOrNull() != null -> "Is boolean"
            name?.toIntOrNull()  != null -> "Is integer"
            name?.toDoubleOrNull() != null -> "Is double"
            name?.toFloatOrNull() != null -> "It float"
            else ->  "It is an string"
        }

}


fun main() {

    println("Please enter a value:")
    val value: String? = readLine()
    println( Solution().solution(value) )
}
