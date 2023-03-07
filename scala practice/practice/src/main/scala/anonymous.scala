import scala.Console.println
import scala.io.StdIn
object anonymous extends App
{
 val doubleTheValue : Int => Int =(x:Int)=>x * 2
  val tripleTheValue : Int => Int = x=> x * 3

  val quadrapler = (x:Int)=> x * 4

  val addTheValues:(Int,Int)=> Int = (a:Int,b:Int) => a+b

 val number: (Int, Int) => String = (firstNumber:Int, secondNumber:Int) => (firstNumber * secondNumber) + "abc"
  
  println(doubleTheValue(2),tripleTheValue(2),quadrapler(2),addTheValues(2,3))
 println(number(2,2))

}
