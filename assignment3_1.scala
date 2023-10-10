import scala.io.StdIn._
object assignment3_1 extends App{
    var str1 = readLine("Enter First String: ")
    var str2 = readLine("Enter Second String: ")
    val newStr = str1.replace(str2,"")
    println(newStr)
}