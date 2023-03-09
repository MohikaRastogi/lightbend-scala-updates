import scala.Console.println
import scala.io.StdIn

object ToggleString extends App {
  try {
    println("Enter the String To convert each character to its reverse case")
    val userInputString = StdIn.readLine()
    if (userInputString.matches("[0-9]+"))
      throw new IllegalArgumentException("Input should only be a String ")
    var finalStringAfterReversingEachCharacter = ""

    def convertCharactersOfStringToReverseCase(inputtedString: String): String = {
      for (index <- 0 until inputtedString.length) {
        if (inputtedString(index).toInt >= 48 && inputtedString(index).toInt <= 56)
          throw new IllegalArgumentException("String should not contain integer values")
        else if (inputtedString(index).toInt >= 97 && inputtedString(index).toInt <= 122)
          finalStringAfterReversingEachCharacter += inputtedString(index).toUpper
        else if (inputtedString(index).toInt >= 65 && inputtedString(index).toInt <= 90)
          finalStringAfterReversingEachCharacter += inputtedString(index).toLower
      }
      finalStringAfterReversingEachCharacter
    }

    println(convertCharactersOfStringToReverseCase(userInputString))
  }
  catch {
    case inputNotAStringOrContainsNumber: IllegalArgumentException => println(s"Error : ${inputNotAStringOrContainsNumber.getMessage}")

    case defaultError: Exception => println(s"Some Error Occurred: ${defaultError.getMessage}")
  }
}

