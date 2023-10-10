abstract class Order(val id: Int, val description: String) {
  def display() = {
    println(s"Order ID: $id")
    println(s"Description: $description")
  }
}

class PurchaseOrder(id: Int, description: String, val vendor: String) extends Order(id, description) {
  override def display() = {
    super.display()
    println(s"Vendor: $vendor")
  }
}

class SalesOrder(id: Int, description: String, val customer: String) extends Order(id, description) {
  override def display() = {
    super.display()
    println(s"Customer: $customer")
  }
}

object assignment4_3 extends App{
    val purchaseOrder = new PurchaseOrder(1, "Purchase of Electronics", "ABC Electronics")
    val salesOrder = new SalesOrder(2, "Sales of Software", "XYZ Software")

    println("Details of Purchase Order:")
    purchaseOrder.display()

    println("\nDetails of Sales Order:")
    salesOrder.display()
}
