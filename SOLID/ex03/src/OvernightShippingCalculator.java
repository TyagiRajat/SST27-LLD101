public class OvernightShippingCalculator implements ShippingCostCalculator {
    @Override
    public double calculateCost(Shipment shipment) {
        return 120 + 10 * shipment.weightKg();
    }
}