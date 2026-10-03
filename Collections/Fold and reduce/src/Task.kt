// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    customers.map { it.getOrderedProducts() }
        .reduce { acumulado, productosDelCliente -> acumulado intersect productosDelCliente }


fun Customer.getOrderedProducts(): Set<Product> =
    this.orders.flatMap { it.products }.toSet()