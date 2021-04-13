class Circle
{
	int radius,length,breadth;
	float pi;

	Circle()
	{
	radius=1;
	pi=3.14f;
	}
	void cal()
	{
	float area=pi*radius*radius;
	System.out.println("area of circle="+area);
	}
	Circle(int l,int b)
	{
	length=l;
	breadth=b;
	}
	void area()
	{
	int area1=length*breadth;
	System.out.println("area of rect="+area1);
	}
	public static void main(String ar[])
	{
	
	Circle c=new Circle();
	Circle c1=new Circle(1,2);
	c.cal();
	c1.area();
	}
}
	