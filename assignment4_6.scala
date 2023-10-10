class Sports(val id: Int, val name: String, val description: String, var amount: Double) {
  def increaseAmount(increase: Double) = {
    if (increase >= 0) {
      amount += increase
      println(s"Amount increased by $increase. New amount: $amount")
    } else {
      println("Invalid amount increase.")
    }
  }

  def decreaseAmount(decrease: Double) = {
    if (decrease >= 0 && decrease <= amount) {
      amount -= decrease
      println(s"Amount decreased by $decrease. New amount: $amount")
    } else {
      println("Invalid amount decrease.")
    }
  }

  def displayDetails() = {
    println(s"ID: $id")
    println(s"Name: $name")
    println(s"Description: $description")
    println(s"Amount: $amount")
  }
}

class Indoor(id: Int, name: String, description: String, amount: Double) extends Sports(id, name, description, amount)

class Outdoor(id: Int, name: String, description: String, amount: Double) extends Sports(id, name, description, amount)

object assignment4_6 extends App{
    val indoorSports = new Indoor(1, "Chess", "Indoor board game", 50.0)
    val outdoorSports = new Outdoor(2, "Football", "Outdoor team sport", 100.0)

    println("Details of Indoor Sports:")
    indoorSports.displayDetails()
    indoorSports.increaseAmount(30.0)
    indoorSports.decreaseAmount(10.0)

    println("\nDetails of Outdoor Sports:")
    outdoorSports.displayDetails()
    outdoorSports.increaseAmount(40.0)
    outdoorSports.decreaseAmount(20.0)
}
