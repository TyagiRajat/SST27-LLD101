public class ExpressShippingCalculator implements ShippingCostCalculator {
    @Override
    public double calculateCost(Shipment shipment) {
        return 80 + 8 * shipment.weightKg();
    }
}