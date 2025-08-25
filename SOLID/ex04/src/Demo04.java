public class Demo04 {
    public static void main(String[] args) {
        System.out.println("=== Basic Payment Service Demo ===");
        IPaymentService basicPaymentService = new PaymentService();
        
        // Test different payment methods
        Payment upiPayment = new Payment("UPI", 499);
        Payment cardPayment = new Payment("CARD", 999);
        Payment walletPayment = new Payment("WALLET", 299);
        
        System.out.println("UPI Payment: " + basicPaymentService.pay(upiPayment));
        System.out.println("Card Payment: " + basicPaymentService.pay(cardPayment));
        System.out.println("Wallet Payment: " + basicPaymentService.pay(walletPayment));
        
        System.out.println("\n=== Enhanced Payment Service Demo ===");
        EnhancedPaymentService enhancedService = new EnhancedPaymentService();
        
        // Register a new payment processor at runtime
        enhancedService.registerNewPaymentProcessor("CRYPTO", new CryptoPaymentProcessor());
        
        // Test the new crypto payment
        Payment cryptoPayment = new Payment("CRYPTO", 100);
        System.out.println("Crypto Payment: " + enhancedService.pay(cryptoPayment));
        
        // Demonstrate provider support check
        System.out.println("Is CRYPTO supported? " + enhancedService.isProviderSupported("CRYPTO"));
        System.out.println("Is BITCOIN supported? " + enhancedService.isProviderSupported("BITCOIN"));
        
        System.out.println("\n=== Error Handling Demo ===");
        try {
            Payment unsupportedPayment = new Payment("BITCOIN", 100);
            basicPaymentService.pay(unsupportedPayment);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}