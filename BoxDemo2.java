class Box
{
	double width,w;
	double height,h;
	double depth,d;
	Box(double width,double h,double d)
	{
	this.width = width;
	this.height = h;
	this.depth = d;
	}
	double volume()
	{
	return width*height*depth;
	}
}
class BoxDemo2
{
	public static void main(String args[])
	{
	double vol;
	Box box2 = new Box(10,15,20);
	vol = box2.volume();
	System.out.println("The volume is : "+vol);
	}
}