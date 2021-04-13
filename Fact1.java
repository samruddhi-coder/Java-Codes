class Fact1
{
	public static void main(String args[])
{
		int i,n,fact=1;
			n=Integer.parseInt(args[0]);
		i=1;
		while(i<n)
		{
			fact=fact*i;
			i++;
		}
			System.out.println("fact"+fact);
}
}
			
			