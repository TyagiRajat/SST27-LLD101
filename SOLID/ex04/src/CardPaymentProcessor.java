public class CardPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(Payment payment) {
        return "Charged card: " + payment.amount();
    }
    
    @Override
    public boolean canProcess(String provider) {
        return "CARD".equals(provider);
    }
}