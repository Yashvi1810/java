import java.util.Scanner;
class factorial
{
	public static void main(String[]args)
	{
		int number, fact=1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		for(i = 1; i<= number; i++)
		{
			fact *= i;
		}
		System.out.println("factorial of " +number+" is "+fact);
	}
}