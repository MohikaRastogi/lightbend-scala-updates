import scala.Console.println
import scala.io.StdIn

object Palindromic_String extends App 
{

  try 
  {
    println("Enter the string to be checked for palindrome: ")
    val user_input = StdIn.readLine() 

    def isPalindrome(wordToCheck: String): Boolean =  //method to check 
    {
      for (index <- 0 until wordToCheck.length / 2)      
      {
        if (wordToCheck(index) != wordToCheck(wordToCheck.length - index - 1)) 
        {
          return false
        }
      }
      true
    }

    println(if (isPalindrome(user_input)) "YES" else "NO")

  } catch     //to handle exception
  {
    case forException: Exception => println(s"An error occurred: ${forException.getMessage}")
  }
}


