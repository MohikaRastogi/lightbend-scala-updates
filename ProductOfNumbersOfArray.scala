import scala.io.StdIn
object ProductOfNumbersOfArray
{
  def main(arguments: Array[String]):
  Unit =
  {
    println("Enter Size Of Array: ")
    val sizeOfArray = StdIn.readInt()
    val inputArray = new Array[Int](sizeOfArray)
    println(" Enter the Positive Numbers of Array: ")
    for(index<- 0 until sizeOfArray)
     {
        inputArray(index) = StdIn.readInt()
     }
    val finalProductOfNumbers = findProduct(inputArray)
    println(s"The product of all the numbers of array is: $finalProductOfNumbers")
  }
   def findProduct(array:Array[Int]):
   Int=
     {
       var product = 1
       for(numbers <- array)
         {
           product*= numbers
         }
         product
     }
}
