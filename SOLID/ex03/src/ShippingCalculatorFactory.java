public class ShippingCalculatorFactory {
    public static ShippingCostCalculator getCalculator(Shipment.ShippingType type) {
        return switch (type) {
            case STANDARD -> new StandardShippingCalculator();
            case EXPRESS -> new ExpressShippingCalculator();
            case OVERNIGHT -> new OvernightShippingCalculator();
        };
    }
}