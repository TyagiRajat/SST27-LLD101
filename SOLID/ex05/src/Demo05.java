public class Demo05
{
	static double areaAfterResize(Polygon polygon)
	{
		return polygon.area();
	}

	public static void main(String[] args)
	{
		System.out.println(areaAfterResize(new Rectangle(2, 10))); // 20
		System.out.println(areaAfterResize(new Square(4)));
	}
}