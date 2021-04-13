import java.io.*;
import java.lang.*;
class aadhar
{
	int adno,panno;
	String name;
	aadhar()
	{
	adno=11;
	panno=12;
	name="fff";   
                  System.out.println("adhar no:"+adno+"  "+"pan no:"+panno+"   "+"name:"+name);                                      
	}
	aadhar(int a,int p,String n)
	{
	
	adno=a;
	panno=p;
	name=n;
	System.out.println("adhar no:"+adno+"  "+"pan no:"+panno+"  "+"name:"+name); 
	}
	
public static void main(String ar[])
{
	aadhar a1=new aadhar();
	
	
	aadhar a2=new aadhar(12,34,"nnn");
	aadhar a3=new aadhar(44,88,"eer");
	aadhar a4=new aadhar(343,89,"llo");
	aadhar a5=new aadhar(66,89,"ooo");
	
}
}
	
	
	
	
		 