class Rec2
{
	int length;
	int breadth;
	Rec2()
	{
	length=10;
	breadth=20;
	}
	Rec2(int l,int b)
	{
	length=l;
	breadth=b;
	}




	void cal()
	{
	int area=length*breadth;		
	int cal=length*breadth*2;
	System.out.println("area is="+area);
	System.out.println("cal is="+cal);
	}
	
	
	public static void main(String arg[])
	{
	Rec2 r1=new Rec2();
	Rec2 r2=new Rec2(5,6);
	r1.cal();
	//r2.area();
	}

}