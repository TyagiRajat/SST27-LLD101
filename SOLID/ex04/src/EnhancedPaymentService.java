public class EnhancedPaymentService implements IPaymentService
{
	private final PaymentProcessorFactory factory;

	public EnhancedPaymentService()
	{
		this.factory = new PaymentProcessorFactory();
	}

	@Override
	public String pay(Payment payment)
	{
		IPaymentProcessor processor = factory.createProcessor(payment.provider());
		return processor.processPayment(payment);
	}

	public void registerNewPaymentProcessor(String provider, IPaymentProcessor processor)
	{
		factory.registerProcessor(provider, () -> processor);
	}

	public boolean isProviderSupported(String provider)
	{
		return factory.isProviderSupported(provider);
	}
}