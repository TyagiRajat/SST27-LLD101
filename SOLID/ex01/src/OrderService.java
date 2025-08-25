public record OrderService(IEmailClient email, IOrderRepository repository) implements IOrderService
{

	double totalWithTax(double subtotal)
	{
		final double taxRate = 0.18;
		return subtotal + subtotal * taxRate;
	}

	public void placeOrder(String customerEmail, double subtotal)
	{
		double total = totalWithTax(subtotal);
		email.sendEmail(customerEmail, "Thanks! Your total is " + total);
		repository.storeOrder(customerEmail, total);
	}
}