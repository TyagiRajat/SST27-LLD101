import java.util.List;
import java.util.Optional;

public class PaymentService implements IPaymentService
{
	private final List<IPaymentProcessor> processors;

	public PaymentService()
	{
		// Initialize with all available processors
		this.processors = List.of(new CardPaymentProcessor(), new UPIPaymentProcessor(), new WalletPaymentProcessor());
	}

	@Override
	public String pay(Payment payment)
	{
		return findProcessor(payment.provider()).map(processor -> processor.processPayment(payment)).orElseThrow(
				() -> new IllegalArgumentException("Unsupported payment provider: " + payment.provider()));
	}

	private Optional<IPaymentProcessor> findProcessor(String provider)
	{
		return processors.stream().filter(processor -> processor.canProcess(provider)).findFirst();
	}
}