class shape
{
	int height,width;
	shape()
	{
	height=5;
	width=5;
	}
	
	shape(int h,int w)
	{
	height=h;
	width=w;
	}
	void area()
	{
	int area=height*width;	
	System.out.println("area is="+area);
	}
	public static void main(String ar[])
	{
	shape s=new shape();
	shape s1=new shape(11,20);
	s1.area();
	s.area();
	
	}
} 