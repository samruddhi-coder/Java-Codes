class Fibo
{
	public static void main(String arg[])
	{
	int n=10,first=1,sec=1,i;
		System.out.println("first"+n+"terms:");
	for( i=1;i<=n;i++)
	{
		System.out.print(" "+first);
	int sum=first+sec;
		first=sec;
		sec=sum;
	}
		}
	}
