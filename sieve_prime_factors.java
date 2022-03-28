package owl;
import java.util.*;

public class sieve_prime_factors 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n=127;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i;
		}
		for(int i=2;i<n;i++)
		{
			for(int j=i;j<n;j=j+i)
			{
				if(arr[j]%i==0 && arr[j]==j)
				{
					arr[j]=i;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=2;i<n;i++)
		{
			while(arr[N]!=1)
			{
				System.out.println(arr[N]+" ");	  
				N=N/arr[N];
			      
			}
			
		}
		
		
		

	}

}
