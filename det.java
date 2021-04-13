
import java.io.*;
class Rectangle
{
	int length,width;
	Rectangle(int l,int w)
	{
		length=l;
		width=w;
	}
	void cal()
	{
		int Rectangle=length*width;
		System.out.println("area rect="+Rectangle);
	}
}
class box extends Rectangle
{
	int depth;
	box(int l,int w,int d)
	{
		super(l,w);
		depth=d;
	}
	void cal()
	{
		super.cal();
		int volume=length*width*depth;
		//System.out.println("area rect="+Rectangle);
		System.out.println("volume rect="+volume);
	}
}


class det
{
	
	public static void main(String ar[])
	{
		box b1=new box(10,20,30);
		b1.cal();
	}
}

	
	
