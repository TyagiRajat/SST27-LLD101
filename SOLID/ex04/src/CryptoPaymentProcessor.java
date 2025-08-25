public class CryptoPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(Payment payment) {
        return "Paid via Crypto: " + payment.amount();
    }
    
    @Override
    public boolean canProcess(String provider) {
        return "CRYPTO".equals(provider);
    }
}