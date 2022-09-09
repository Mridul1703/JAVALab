import java.util.*;
public class TwoThree7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n;
		int a[]= new int[3];
		System.out.println("Enter a three digit number");
		n=sc.nextInt();
		for (int i = 0 ; i < 3 ; i++)
		{
			a[i]=n%10;
			n=n/10;
		}
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j  = 0 ; j < 3 ; j++)
			{
				for (int k =  0 ; k < 3 ;k++)
				{
					if(a[i] != a[j] && a[j] != a[k] && a[k] !=a[i])
					{
						System.out.println(a[i]+""+a[j]+""+a[k]);
					}
				}
			}
		}
	}
}