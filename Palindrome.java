class Palindrome
{
	public static void main(String arg[])
	{
		int rev=0;
		int n=Integer.parseInt(arg[0]);
		int no=n;
		while(n>0)
		{
			int dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(rev==no)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		
		}
		}	
		}
