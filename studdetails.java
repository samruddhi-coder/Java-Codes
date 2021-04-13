class Student
{
String stud_name;
int rollno;
String branch;
Student(String n,int r, String b)
{
stud_name=n;
rollno=r;
branch=b;
}
void display()
{
System.out.println("name of student is="+stud_name);
System.out.println("rollno is="+rollno);
System.out.println("branch of student is="+branch);
}
}
class Studdetails
{
public static void main(String []arg)
{
Student s1=new Student ("shruti",9,"co");
s1.display();
}
}