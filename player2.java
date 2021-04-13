class player2
{
	public static void main(String arg[])
	{
	String name1=arg[0];
int no1=Integer.parseInt(arg[1]);
	String name2=arg[2];
int no2=Integer.parseInt(arg[3]);
	String name3=arg[4];
int no3=Integer.parseInt(arg[5]);
		if(no1>no2 && no1>no3)
		{
		System.out.println("Player is"+name1);
		}
	 	else if (no2>no3 && no2>no1)
		{
		System.out.println("Player is"+name2);
		}
		
		//System.out.println("Player is"+name3);
		
		
	}
}
