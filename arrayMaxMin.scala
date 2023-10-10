import scala.io.StdIn.readInt
object arrayMaxMin extends App{
    val a = new Array[Int](5)
    
    for(i <- 0 to (a.length-1)){
        a(i) = readInt()
    }
    var max=a(0)
    var min=a(0)
    for(i <- 0 to (a.length-1)){
        if(a(i)>max){
            max = a(i)
        }
        if(a(i)<min){
            min = a(i)
        }
    }
    println("Max: " + max)
    println("Min: " + min)
}