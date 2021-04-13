class Food
{
  	public:
	
	String Foodname;
	int Quantity;
	Food(String f,int q)
	{
		Foodname=f;
		Quantity=q;
	}
	void display()
	{
		System.out.println("Foodname is="+Foodname);
		System.out.println("Food Quantity is="+Quantity);
	}
}
class hotel extends Food

{
	public:
	String name;
	hotel(String f,int q,String n)
	{
	super(f,q);
	name=n;
	}
	void show()
	{
	display();
	System.out.println(" hotel name="+name);
	}	
}

class Hoteldet
{
	public static void main(String ar[])
	{
	hotel h1=new hotel("Sandwich",10,"karishma");
	h1.show();
	}
}
	