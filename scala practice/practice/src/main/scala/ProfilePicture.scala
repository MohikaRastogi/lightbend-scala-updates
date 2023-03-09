import scala.Console.println
import scala.io.StdIn

object ProfilePicture extends App {
  try {
    println("Please input length of square, width of your photo and height of your photo respectively : ")
    val inputLength = StdIn.readInt()
    val inputWidth = StdIn.readInt()
    val inputHeight = StdIn.readInt()

    //checking whether length or height or width are zero
    if (inputLength <= 0 || inputWidth <= 0 || inputHeight <= 0)
      throw new IllegalArgumentException("Invalid values: Length or width or height cannot be zero or negative")

    // method to decide what action is taken on basis of length,width,height
    def eventOnPhotoUpload(lengthOfSquare: Int, widthOfPhoto: Int, heightOfPhoto: Int): String = {
      if (lengthOfSquare > widthOfPhoto || lengthOfSquare > heightOfPhoto)
        " Photo Too Small: Please Upload Another Photo "
      else if (lengthOfSquare == widthOfPhoto && lengthOfSquare == heightOfPhoto)
        " Uploaded: Photo Accepted "
      else
        " Photo Too Big: Crop Photo"
    }

    println(eventOnPhotoUpload(inputLength, inputWidth, inputHeight))
  }
  catch {
    case lengthOrWidthOrHeightUnacceptable: IllegalArgumentException => println(s"Error : ${lengthOrWidthOrHeightUnacceptable.getMessage}")

    case defaultException: Exception => println(s"Error : ${defaultException.getMessage}")
  }
}
