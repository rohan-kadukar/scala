import scala.io.StdIn._
object assignment3_2 extends App{
    val a = new Array[String](5)
    a(0) ="Hello"
    a(1) = "Hii"
    a(2) = "hey"
    a(3) = "Hmm"
    a(4) = "Well"
    var str1 = readLine("Enter a String: ")
    for(i <- 0 to (a.length-1)){
        if(a(i)==str1){
            println(a(i))
        }
    }
    
}