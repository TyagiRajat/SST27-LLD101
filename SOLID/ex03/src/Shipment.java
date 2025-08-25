public record Shipment(ShippingType type, double weightKg) {
    public enum ShippingType {
        STANDARD, EXPRESS, OVERNIGHT
    }
}