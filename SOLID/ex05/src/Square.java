public record Square(int length) implements Polygon
{
	public double area()
	{
		return length * length;
	}
}