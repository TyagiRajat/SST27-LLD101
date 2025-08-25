public class Demo02
{
	public static void main(String[] args)
	{
		IPlayer player = new Player();

		System.out.println("Test 1: Small file");
		player.play(new byte[]{1, 2, 3, 4});

		System.out.println("\nTest 2: Larger file");
		player.play(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

	}
}