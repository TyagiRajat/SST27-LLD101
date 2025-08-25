public class ShippingService {
    private final ShippingCostCalculator calculator;
    
    public ShippingService(ShippingCostCalculator calculator) {
        this.calculator = calculator;
    }
    
    public double processShipment(Shipment shipment) {
        return calculator.calculateCost(shipment);
    }
}