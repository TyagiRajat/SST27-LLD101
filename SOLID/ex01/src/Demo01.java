

public class Demo01 {
    public static void main(String[] args) {
        IEmailClient emailClient = new EmailClient();
        IOrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(emailClient, orderRepository);
        orderService.placeOrder("a@shop.com", 100.0);
    }
}