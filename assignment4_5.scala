class Project(val id: Int, val name: String, val location: String) {
  Project.incrementCount()
  private val projectNumber: Int = Project.projectCount

  def displayDetails() = {
    println(s"Project Number: $projectNumber")
    println(s"Project ID: $id")
    println(s"Project Name: $name")
    println(s"Project Location: $location")
  }
}

object assignment4_5 extends App{
  private var projectCount: Int = 0

  def incrementCount() = {
    projectCount += 1
  }

    val project1 = new Project(1, "Project A", "Location A")
    val project2 = new Project(2, "Project B", "Location B")
    val project3 = new Project(3, "Project C", "Location C")

    println("Details of Projects:")
    project1.displayDetails()
    println()
    project2.displayDetails()
    println()
    project3.displayDetails()

    println(s"\nTotal Projects Created: $projectCount")
}
