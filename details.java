class student
{
	String stud_name;
	String branch;
	int roll_no;
		student(String n,String b,int r)
		{
		stud_name=n;
		branch=b;
		roll_no=r;
		}
	void display()
	{
	System.out.println("Student name is="+stud_name);
	System.out.println("Branch is="+branch);
	System.out.println("Roll_no is="+roll_no);
	}
	
}
class details
{
	public static void main(String arg[])
	{
	student s1= new student("abcd","computer",12);
	s1.display();
	} 
}