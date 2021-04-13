import java.io.*;
import java.lang.*; 

class Rectangle 
{
	int length,width;
	Rectangle (int l,int w)
	{
	length=l;
	width=w;
	}
	void area()
	{
	int Rectangle=length*width;
	System.out.println(" rect area="+Rectangle);
	}
}
	
	class  box extends Rectangle
	{
	int dept;
	box (int l,int w,int d)
	{
	super(l,w);
	dept=d;
	}
	void cal()
	{
	area();
	int volume= length*width*dept;

	System.out.println("volume="+volume);
	}
}
	class det1
	{	
	public static void main(String args[])
	{

	box b1=new box(1,10,20);
	b1.cal();
}
}

	
	