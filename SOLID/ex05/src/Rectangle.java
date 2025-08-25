public record Rectangle(int length, int breadth) implements Polygon
{
	public double area()
	{
		return length * breadth;
	}

}