import java.lang.*;
import java.io.*;



class Student
{
	int rollno;
	String name;
	void accept()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the rollno");
		 rollno=Integer.parseInt(br.readLine());
		System.out.println("enter the name");
		 name=br.readLine();
	}
	void display()
	{
		System.out.println("student rollno="+rollno);
		System.out.println("student name="+name);
	}
}
class library extends Student
{
	int no;
	void get()throws IOException
	{
		accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no");
		 no=Integer.parseInt(br.readLine());
	}	
	void put()
	{
		display();
		System.out.println("library no="+no);
	}

}	
class dett
{
	public static void main(String ar[])throws IOException
	{
		library l=new library();
		l.get();
		l.put();
	}
}
		
	
	
	