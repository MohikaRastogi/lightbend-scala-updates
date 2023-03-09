import scala.Console.println
import scala.io.StdIn

object ToggleString extends App {
  try {
    println("Enter the String To convert each character to its reverse case")
    val userInputString = StdIn.readLine()
                         //checking if input is an integer instead of string
    if (userInputString.matches("[0-9]+"))
      throw new IllegalArgumentException("Input should only be a String ")
    var finalStringAfterReversingEachCharacter = ""
                     //method to convert the string characters to upper and lower cases
    def convertCharactersOfStringToReverseCase(inputtedString: String): String = {
      for (index <- 0 until inputtedString.length) {
                             //checking if string contains integers
        if (inputtedString(index).toInt >= 48 && inputtedString(index).toInt <= 56)
          throw new IllegalArgumentException("String should not contain integer values")

           //if lower case character(ascii values a-z=97-122) is encountered then convert to upper case
        else if (inputtedString(index).toInt >= 97 && inputtedString(index).toInt <= 122)
          finalStringAfterReversingEachCharacter += inputtedString(index).toUpper

        //if upper case character(ascii values a-z=65-90) is encountered then convert to lower case
        else if (inputtedString(index).toInt >= 65 && inputtedString(index).toInt <= 90)
          finalStringAfterReversingEachCharacter += inputtedString(index).toLower
      }
      finalStringAfterReversingEachCharacter
    }

    println(convertCharactersOfStringToReverseCase(userInputString))
  }
  catch //catching the thrown exceptions -if any
  {
    case inputNotAStringOrContainsNumber: IllegalArgumentException => println(s"Error : ${inputNotAStringOrContainsNumber.getMessage}")

    case defaultError: Exception => println(s"Some Error Occurred: ${defaultError.getMessage}")
  }
}

