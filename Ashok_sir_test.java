package owl;

import java.util.*;


public class Ashok_sir_test 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int prefix[]=new int[n+1];
		prefix[n+1]=0;
		int q=sc.nextInt();
		while(q!=0)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			int x=sc.nextInt();
			prefix[l]=prefix[l]+x;
			prefix[r+1]=prefix[r+1]-x;
			q--;
		}
		for(int i=1;i<n+1;i++)
		{
			prefix[i]=prefix[i-1]+prefix[i];
		}
		System.out.println(Arrays.toString(prefix));
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]+prefix[i];
		}

//		System.out.println(Arrays.toString(arr));
		
	}
	
}	
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		while(q!=0)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			int x=sc.nextInt();
			for(int i=l;i<=r;i++)
			{
				arr[i]=x+arr[i];
			}
			
			q--;
			
		}
		System.out.println(Arrays.toString(arr));
        
	}

}
*/
