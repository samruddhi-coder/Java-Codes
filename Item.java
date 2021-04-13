import java.io.*;
import java.lang.*;
class Item
{
	int code;
	float price;
	Item(int c,float p)
	{
	code=c;
	price=p;
	}
	void display()
	{
	System.out.println("code="+code);
	System.out.println("price="+price);
	}
public static void main(String ar[])
{
	Item i=new Item(22,43.44f);
	i.display();
}
}