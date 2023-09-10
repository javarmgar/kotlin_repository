package exercises.`01_Basics`.`02_Data_Types`.exercise_03_type_conversions


enum class DataType(val nameOf:String){
    INT("Int"),
    STRING("String"),
    DOUBLE("Double"),
}

class Solution {


    fun solution(value: String?, fromType: String?, toType: String?) {

        when(fromType?.uppercase()){
            DataType.INT.name -> when(toType?.uppercase()){
                DataType.INT.name -> println("the source data type and destination data type are the same Int")
                DataType.DOUBLE.name -> println( "The value is ${(value?.toInt())?.toDouble()}")
                DataType.STRING.name -> println( "The value is ${(value?.toInt())}")
            }
            DataType.DOUBLE.name -> when(toType?.uppercase()){
                DataType.INT.name -> println( "The value is ${(value?.toDouble())?.toInt()}")
                DataType.DOUBLE.name -> println("the source data type and destination data type are the same Double")
                DataType.STRING.name -> println( "The value is ${(value?.toDouble())}")
            }
            DataType.STRING.name -> when(toType?.uppercase()){
                DataType.INT.name -> println( "The value is ${(value)?.toInt()}")
                DataType.DOUBLE.name -> println( "The value is ${(value)?.toDouble()}")
                DataType.STRING.name -> println("the source data type and destination data type are the same Double")
            }
        }

    }
}


fun main() {

    println("Which data type do you want to convert from? (Int, Double, String)")
    val fromType = readLine()
    println("Please enter the value:")
    val value = readLine()
    println("Which data type do you want to convert to? (Int, Double, String)")
    val toType = readLine()
    println( Solution().solution(value, fromType, toType) )
}

