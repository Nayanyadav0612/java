class CircleStatic
{
	private double radius;
    /*The number of objects created*/
    private static int numberofobjects = 0;


    public void setradius(double a)
    {
    radius = a;
    numberofobjects++;
    }

    public double getradius()
    {
    return radius;
    }

    public static int getnumberofobjects()
    {
    return numberofobjects;
    }
    public void findarea()
    {
    double area;
    area = 3.14*radius*radius;
    System.out.print("The area is : "+area);
    }
}
public class TestCircleStatic
{
	/*main method*/
	public static void main(String args[])
	{
	CircleStatic circle1 = new CircleStatic();
	circle1.setradius(5);
	System.out.println("radius of circle : "+circle1.getradius());
	System.out.println("The number of circle objects : " +CircleStatic.getnumberofobjects());
	CircleStatic circle2 = new CircleStatic();
	circle1.findarea();
	circle2.setradius(5);
	System.out.println("Circle1 radius : " +circle2.getradius());
    System.out.println("The number of circle objects : "+CircleStatic.getnumberofobjects());
    circle2.findarea();
	}
}