abstract class Shape {
  def volume(): Double
  def display()
}

class Cube(sideLength: Double) extends Shape {
  def volume(): Double = sideLength * sideLength * sideLength

  def display() = {
    println("Cube:")
    println(s"Side Length: $sideLength")
    println(s"Volume: ${volume()}")
  }
}

class Cylinder(radius: Double, height: Double) extends Shape {
  def volume(): Double = math.Pi * radius * radius * height

  def display() = {
    println("Cylinder:")
    println(s"Radius: $radius")
    println(s"Height: $height")
    println(s"Volume: ${volume()}")
  }
}

object assignment4_4 extends App{
    val cube = new Cube(5.0)
    val cylinder = new Cylinder(3.0, 7.0)

    cube.display()
    println()
    cylinder.display()
}
