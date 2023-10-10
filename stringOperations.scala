import scala.io.StdIn._
object stringOperations extends App{
    var str1 = "Hello of Scala"
    var str2 = "Scala"
    var str3 = ""
    println(str1 == str2)
    println(str1.equals(str2))
    println(str1.compareTo(str2))
    println(str1.charAt(5))
    str3 = str1.concat(str2)
    println(str3)
    println(str1.endsWith("la"))
    println(str2.indexOf("a"))
    println(str1.lastIndexOf(str2))
    
    println(str1.replaceAll("of","for"))
    println(str1.toUpperCase())
    println(str2.toLowerCase())

}