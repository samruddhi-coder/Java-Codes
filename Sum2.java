
import java.lang.*;
import java.io.*;
class Sum2
{
	public static void main(String args[]) throws IOException
{
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter a no");
			int a=Integer.parseInt(br.readLine());
			System.out.println("enter b no");
			int b=Integer.parseInt(br.readLine());
			int c=a+b;
			System.out.println("c"+c);
		}
			}