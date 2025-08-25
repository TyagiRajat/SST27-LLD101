public class OrderController
{
	OrderRepository orderRepo;

	public OrderController(OrderRepository orderRepo)
	{
		this.orderRepo = orderRepo;
	}

	void create(String id)
	{
		orderRepo.save(id);
		System.out.println("Created order: " + id);
	}
}