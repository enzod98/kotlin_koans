// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    val delivered = customer.orders.filter { it.isDelivered }
    return delivered.flatMap { it.products }.maxByOrNull { it.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val orders = customers.flatMap { it.getOrderedProducts() }
    return orders.count { it == product }
}

fun Customer.getOrderedProducts(): List<Product> =
    orders.flatMap { it.products }