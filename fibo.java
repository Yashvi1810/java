import java.util.Scanner;
class fibo
{
	public static void main(String[]args)
	{
		int number, a=0, b=1, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		System.out.println("fibo Series");
		for(int i = 1; i<= number ; i++)
		{
			c = a+b;
			System.out.println(" " +a );
			a = b;
			b = c;
		}
	}
}