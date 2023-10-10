class Employee(val id: Int, val name: String, var salary: Double) {
  def accept()  = {
    println("Enter Employee Details:")
    println("ID: " + id)
    println("Name: " + name)
    println("Salary: " + salary)
  }

  def display() = {
    println("Employee Details:")
    println("ID: " + id)
    println("Name: " + name)
    println("Salary: " + salary)
  }
}

object assignment4_2 extends App{

    val employee1 = new Employee(1, "John Doe", 50000.0)
    val employee2 = new Employee(2, "Jane Smith", 60000.0)
    val employee3 = new Employee(3, "Bob Johnson", 75000.0)

    val employees = List(employee1, employee2, employee3)

    // Find the employee with the maximum salary
    val employeeWithMaxSalary = employees.maxBy(_.salary)

    println("Details of Employee with Maximum Salary:")
    employeeWithMaxSalary.display()

}
