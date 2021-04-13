import java.io.*;
import java.lang.*;
class Acc
{
	int accno;
	String accname;
	float bal;
	Acc(int no,String na,float b)
	{
	accno=no;
	
	accname=na;
	bal=b;

	}
	void display()
	{
	System.out.println("accno="+accno);
	System.out.println("name="+accnam);
	System.out.println("balance="+bal);
	}
public static void main(String ar[])
{
	Acc i=new Acc(22,abc,43.44f);
	i.display();
}
}