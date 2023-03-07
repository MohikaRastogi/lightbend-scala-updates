import scala.Console.println
import scala.io.StdIn
object Main extends App {
  println("enter the string")
  val user_input = StdIn.readLine()

  def isInteger(inputtedString: String): Boolean = {       //method to check whether string contains any integer or not
    var count: Int = 1
    for (index <- 0 until inputtedString.length) {
      if (inputtedString(index).toInt >= 48 && inputtedString(index).toInt < 57) {
        count = count + 1
      }
    }
    if (count == 1) {              //if count has not changed then there is no integer in entered string
      true
    }
    else {
       false
    }
  }


  println(isInteger(user_input))
}
