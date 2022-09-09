import java.util.*;
public class TwoThree6 {
	public static void main(String args[])
	{
		int num=10;
		int arr[]=new int[num];
		String ch[]=new String [num];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the marks of 10 students");	
		//input
		for (int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		//sorting
		for (int i = 0;i<(num-1);i++) 
		{
		      for (int j = 0; j < num - i - 1; j++) 
		      {
		        if (arr[j] > arr[j+1]) 
		        {
		           int temp = arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1] = temp;
		        }
		      }
		}
		
		for(int i=0;i<num;i++)
		{
			if(arr[i]>40 && arr[i]<=50)
			{
				ch[i]="PASS";
			}
			else if(arr[i]>51 && arr[i]<=75)
			{
				ch[i]="MERIT";
			}
			else
			{
				ch[i]="DISTINCTION";
			}
		}
		//printing
		System.out.println("MARKS"+"\t\t"+"GRADE");
		for(int i=0; i<num;i++)
		{
			System.out.println(arr[i]+"\t\t"+ch[i]);
		}
	}
}