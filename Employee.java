class Employee
{
int empid;
String name;
float salary;
void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the empid");
empid=Input.parseInt(br.readLine());
System.out.println("enter the name of employee");
name=br.readLine();
System.out.println("enter the salary of employee");
salary=Float.parseFloat(br.readLine());
}
}
public static void main(String ar[])
{
employee e[]=new employee[5];
for(int i=0;i<5;i++)
{
 e[i]=new employee();
}
for(int i=0;i<5;i++)
{
e[i].accept();
}
}

