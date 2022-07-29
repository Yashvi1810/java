import java.util.Scanner;

class reverse
{
	public static void main(String args[])
	{
		int n,reversed=0,temp;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string of digits to reverse:");
		n=sc.nextInt();
		while(n!=0)
		{
			temp=n%10;
			reversed=reversed*10+temp;
			n=n/10;
		}
		System.out.println("The reverse is " + reversed);
	}
}