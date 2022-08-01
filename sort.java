import java.util.Scanner;

class Sort {   
    public static void main(String[] args)
    {       
        int arre[] = { 4, 3, 2, 1 };
        for (int i = 0; i < a.length; i++) 
	{
            for (int j = i + 1; j < arre.length; j++)
 {               
                int temp = 0;
                if (arre[j] < arre[i]) 
{                 
                    temp = arre[i];
                    arre[i] = arre[j];
                    arre[j] = temp;
                }
            }
 
            System.out.print(a[i] + " ");
        }
    }
}
