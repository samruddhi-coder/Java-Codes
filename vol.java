class area
{
	int length,width;
	area(int l,int w)	
	{
		length=l;
		width=w;
	}
	int cal()
	{
		return(length*width);
	}
	
}
class volume
{
	int heigth;	
	volume(int l,int w,int h)	
	{
		super(l,w);
		heigth=h;
	}
	int calc()
	{
		return(length*width*heigth);
	}
}

class vol
{
	public static void main(String ar[])
	{
		volume v1=new volume(30,40,50);
		int vol=v1.calc();
		System.out.println("volume="+vol);
	}
}	
		