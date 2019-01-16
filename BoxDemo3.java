class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
	System.out.println("Constructing Box");
	width = 10;
	height = 15;
	depth = 20;
	}
	Box(double w, double h, double d)
	{
	width = w;
	height = h;
	depth = d;
	}
	Box(double len)
	{
		width = height = depth = len;
	}
	double volume ()
	{
		return width*height*depth;
	}
}
class BoxDemo3
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is : "+vol);
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is : "+vol);
		Box mycube = new Box(7);
		vol = mycube.volume();
		System.out.println("Volume of mycube is : "+vol);
		//vol = mybox3.volue();
		//System.out.println("Volume is ; +vol");
	}
}