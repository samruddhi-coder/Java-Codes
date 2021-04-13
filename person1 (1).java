import java.io.*;
import java.lang.*;
class person1
{
	int adno,panno;
	String name;
	person1()
	{
	adno=2;
	panno=23;
	name="mrunu";
	
	System.out.println("adno="+adno);
	System.out.println("panno="+panno);
	System.out.println("name="+name);
	}
	person1(int a,int p,String n)
	{
	adno=a;
	panno=p;
	name=n;
                    

	System.out.println("adno="+adno);
	System.out.println("panno="+panno);
	System.out.println("name="+name);
	}
public static void main(String args[])
{
	person1 p1=new person1();

	person1 p2=new person1( 2 ,40,"gjh");

	person1 p3=new person1(4,67,"gux");
	
	person1 p4=new person1(55,88,"dfg");
	
	person1 p5=new person1(22,5534,"gsw");
	
}
}