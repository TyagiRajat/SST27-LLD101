public interface IPaymentProcessor {
    String processPayment(Payment payment);
    boolean canProcess(String provider);
}