import java.lang.*;
import java.io.*;

class student
{
	int rollno;
	String name;
	void get()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter rollno");
	rollno=Integer.parseInt(br.readLine());
	System.out.println("enter name");
	name=br.readLine();
	}
	void display()
	{
	System.out.println("rollno="+rollno);
	System.out.println("name="+name);
	}
}
class attend extends student
{
	int presentdays;
	void getdata()throws IOException	
	{
	get();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter presentdays");
	presentdays=Integer.parseInt(br.readLine());
	
	}
	void cal()
	{
	display();
	int attendance=(presentdays*100)/180;
	System.out.println("attendance="+attendance);
	}
}

class det
{
	public static void main(String ar[])throws IOException
	{
	attend a1=new attend();
	a1.getdata();
	a1.cal();
	}
}