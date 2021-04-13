
class Rectangle
{
	int lenght;
	int width;
	void getData(int x,int y)
	{
		lenght=x;
		width=y;
	
	}
	
	int rectarea()
	{
		return(lenght*width);
	}
	}
class Rec
{
	public static void main(String ar[])
	{
	int r;
	int area1;
	Rectangle r1=new Rectangle();
	//Rectangle r2=new Rectangle();
	r1.lenght=10;
	r1.width=20;
	area1=r1.lenght*r1.width;
	System.out.println("area"+area1);

	r1.getData(30,40);
	r=r1.rectarea();
	System.out.println("area"+r);
	
	}
		}
	
	