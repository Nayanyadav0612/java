class Circle
{
	double radius;
	double area;
	void findarea()
	{
	area = radius * radius * 3.14;
	}
	void displayarea()
	{
	System.out.print("The area is:" + area);
	}
}
class CircleDemo
{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.radius = 2;
	c.findarea();
	c.displayarea();
	}
}