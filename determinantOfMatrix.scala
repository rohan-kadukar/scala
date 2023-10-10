import scala.io.StdIn.readInt
object determinantOfMatrix extends App{
    val a = Array.ofDim[Int](2,2)
    
    for(i <- 0 until 2){
        for(j <- 0 until 2){
            a(i)(j) = readInt()
        }
    }

    val determinant = a(0)(0)*a(1)(1)-a(1)(0)*a(0)(1)

    println("Determinant is: " +determinant)

    
}