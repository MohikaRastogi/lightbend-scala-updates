import scala.Console.println
import scala.io.StdIn
object CountDivisors extends App
{
  try
  {
    println("Enter three numbers: ")
    var user_input1 = StdIn.readInt()
    var user_input2 = StdIn.readInt()
    val user_input3 = StdIn.readInt()
      var count = 0
      if(user_input3 == 0)
        {
          throw new IllegalArgumentException("Cannot divide by zero")
        }
      else if(user_input1 > user_input2)
      {
        user_input1 = user_input1 + user_input2
        user_input2 = user_input1 - user_input2
        user_input1 = user_input1 - user_input2
        println(countDivisibleNumbers(user_input1,user_input2,user_input3))
      }
      else
        {
          println(countDivisibleNumbers(user_input1,user_input2,user_input3))
        }
      def countDivisibleNumbers(firstNumber:Int, secondNumber:Int,thirdNumber: Int):Int = {
        for ( index <- firstNumber to secondNumber)
        {
          if (index % thirdNumber == 0)
          {
            count = count + 1
          }
        }
        count
      }
    }
  catch
    {  // exception for dividing by zero
      case cannotDivideByZeroError: IllegalArgumentException => println(s"Error: ${cannotDivideByZeroError.getMessage}")

      //if something else error occurred
      case defaultError: Exception => println(s"An error occurred: ${defaultError.getMessage}")
    }
}
