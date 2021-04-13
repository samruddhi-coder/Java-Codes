class Student
{
int rollno;
String name;
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println("rollno is="+rollno);
System.out.println("name is="+name);
}
}
class Library extends Student
{
int member_no;
Library(int r,String n,int m)
{
super(r,n);
member_no=m;
}
void show()
{
display();
System.out.println("member number is="+member_no);
}

public static void main(String ar[])
{
Library L1=new Library(19,"tanvi",5);
L1.show();
}
}



