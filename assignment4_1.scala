class CurrentAccount(val accNo: Int, val name: String, var balance: Double, var mainBalance: Double) {
  def withdraw(amount: Double) = {
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount. Current balance: $balance")
    } else {
      println("Insufficient balance for withdrawal.")
    }
  }

  def deposit(amount: Double) = {
    if (amount > 0) {
      balance += amount
      mainBalance += amount
      println(s"Deposited $amount. Current balance: $balance")
    } else {
      println("Invalid deposit amount.")
    }
  }

  def viewBalance() = {
    println(s"Account Number: $accNo")
    println(s"Account Holder: $name")
    println(s"Available Balance: $balance")
    println(s"Main Balance: $mainBalance")
  }
}

// Create an object of CurrentAccount and perform operations
object assignment4_1 extends App{
    val account = new CurrentAccount(12345, "John Doe", 1000.0, 1000.0)

    account.viewBalance()
    account.deposit(500.0)
    account.withdraw(200.0)
    account.viewBalance()

}
