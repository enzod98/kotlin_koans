// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    this.customers.filter{ customer ->
        val(pedidosEntregados, pedidosSinEntregar) = customer.orders.partition { it.isDelivered }
        pedidosEntregados.size < pedidosSinEntregar.size
    }.toSet()

