import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int i=1,fact=1,n;

		System.out.println("Enter a number to find its factorial");
		n=sc.nextInt();

		while(i<=n)
		{
			fact=fact*i;
			i=i+1;
		}
		System.out.println("The factorial of "+n+" is "+fact);
	}	
}