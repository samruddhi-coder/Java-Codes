import java.io.*;
import java.lang.*;
class Gross
{
int basic,hra,da;
void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the basic salary");
basic=Integer.parseInt(br.readLine());
System.out.println("enter the hra");
hra=Integer.parseInt(br.readLine());
System.out.println("enter the da");
da=Integer.parseInt(br.readLine());
}
void display()
{
System.out.println("basic is="+basic);
System.out.println("hra is="+hra);
System.out.println("da is="+da);
}
void cal()
{
int sal=basic+hra+da;
System.out.println("salary is="+sal);
}
public static void main(String ar[])throws IOException
{
Gross G[]=new Gross[5];
for(int i=0;i<5;i++)
{
G[i]=new Gross();
}
for(int i=0;i<5;i++)
{
G[i].accept();
G[i].display();
G[i].cal();
}
}
}


