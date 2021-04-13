
import.java.io.*;
class Mobile
{
String comp_name;
int screen_size;
}
void accept()throws IOException
{
BufferedReader.br=new BufferedReader(new Input StreamReader(System.in));
System.out.println("enter the company name");
comp_name=br.readline();
System.out.println("enter the size of mobile");
screen_size=Integer.parseInt(br.radline());
}
void display()
{
System.out.println("name of company is ="+comp_name);
System.out.println("size of screen is="+screen_size);
}
}
class Mobdetails
{
public static void main(String[]arg)throws IOException
{
Mobile m1=new Mobile [5];
for(int i=1;i<=5;i++)
{
 m1[i].accept();
}
for(int i=1;i<=5;i++)
{
m1[i].display()
}
}