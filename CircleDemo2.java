class Circle
{
	private double radius;
	public double area;

	public void setradius()
	{
	radius = 5;
	}
	public void getradius()
	{
	System.out.println(radius);
	}

	void findarea()
	{
	area = 3.14*radius*radius;
	}
	void displayarea()
	{
	System.out.println("The area of circle is "+area);
	}
}
class CircleDemo2
{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.setradius();
	c.getradius();
	c.findarea();
	c.displayarea();
	}
}