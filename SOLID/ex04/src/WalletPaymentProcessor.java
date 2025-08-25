public class WalletPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(Payment payment) {
        return "Wallet debit: " + payment.amount();
    }
    
    @Override
    public boolean canProcess(String provider) {
        return "WALLET".equals(provider);
    }
}