public class StandardShippingCalculator implements ShippingCostCalculator {
    @Override
    public double calculateCost(Shipment shipment) {
        return 50 + 5 * shipment.weightKg();
    }
}