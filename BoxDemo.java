import java.util.*;
class Box
{
	double width , w;
	double height, h;
	double depth, d;
	void setdim()
	{
	w = width;
	h = height;
	d = depth;
	}
	double volume()
	{
	return w*h*d;
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
	double vol;
	Scanner Input = new Scanner(System.in);
	Box b1 = new Box();
	System.out.println("Enter the values for box b1");
	b1.width = Input.nextInt();
	b1.height = Input.nextInt();
	b1.depth = Input.nextInt();
	b1.setdim();
	vol = b1.volume();
	System.out.println("The volume is : "+vol);
	}
}