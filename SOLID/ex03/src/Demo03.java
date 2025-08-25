public class Demo03 {
    public static void main(String[] args) {
        // Test different shipping types
        Shipment expressShipment = new Shipment(Shipment.ShippingType.EXPRESS, 2.0);
        Shipment standardShipment = new Shipment(Shipment.ShippingType.STANDARD, 1.5);
        Shipment overnightShipment = new Shipment(Shipment.ShippingType.OVERNIGHT, 3.0);
        
        ShippingCostCalculator expressCalculator = ShippingCalculatorFactory.getCalculator(Shipment.ShippingType.EXPRESS);
        ShippingCostCalculator standardCalculator = ShippingCalculatorFactory.getCalculator(Shipment.ShippingType.STANDARD);
        ShippingCostCalculator overnightCalculator = ShippingCalculatorFactory.getCalculator(Shipment.ShippingType.OVERNIGHT);
        
        System.out.println("Express shipping cost: " + expressCalculator.calculateCost(expressShipment));
        System.out.println("Standard shipping cost: " + standardCalculator.calculateCost(standardShipment));
        System.out.println("Overnight shipping cost: " + overnightCalculator.calculateCost(overnightShipment));
        
        // Demonstrate dependency injection with ShippingService
        ShippingService expressService = new ShippingService(expressCalculator);
        ShippingService standardService = new ShippingService(standardCalculator);
        
        System.out.println("\nUsing ShippingService:");
        System.out.println("Express service cost: " + expressService.processShipment(expressShipment));
        System.out.println("Standard service cost: " + standardService.processShipment(standardShipment));
    }
}