public class UPIPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(Payment payment) {
        return "Paid via UPI: " + payment.amount();
    }
    
    @Override
    public boolean canProcess(String provider) {
        return "UPI".equals(provider);
    }
}