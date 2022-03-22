package owl;

import java.util.Scanner;

public class Sum_of_two_arrays {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=sc.nextInt();
		int count=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr[i]+arr[j]==a)
				{
					System.out.println(i+" "+j);
					count++;
				}
				
			}
		}
		if(count==0)
		{
			System.out.println("Not possible");
		}

	}

}
