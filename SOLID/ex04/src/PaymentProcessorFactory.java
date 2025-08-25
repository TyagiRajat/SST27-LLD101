import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentProcessorFactory {
    private final Map<String, Supplier<IPaymentProcessor>> processorRegistry;
    
    public PaymentProcessorFactory() {
        this.processorRegistry = new HashMap<>();
        registerDefaultProcessors();
    }
    
    private void registerDefaultProcessors() {
        registerProcessor("CARD", CardPaymentProcessor::new);
        registerProcessor("UPI", UPIPaymentProcessor::new);
        registerProcessor("WALLET", WalletPaymentProcessor::new);
    }
    
    public void registerProcessor(String provider, Supplier<IPaymentProcessor> processorSupplier) {
        processorRegistry.put(provider, processorSupplier);
    }
    
    public IPaymentProcessor createProcessor(String provider) {
        Supplier<IPaymentProcessor> supplier = processorRegistry.get(provider);
        if (supplier == null) {
            throw new IllegalArgumentException("Unsupported payment provider: " + provider);
        }
        return supplier.get();
    }
    
    public boolean isProviderSupported(String provider) {
        return processorRegistry.containsKey(provider);
    }
}