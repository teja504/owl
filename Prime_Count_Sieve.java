package owl;

import java.util.*;


public class Prime_Count_Sieve
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=50;
		boolean primes[]=new boolean[size];
		Arrays.fill(primes,true);
		primes[0]=primes[1]=false;
		for(int i=2;i*i<size;i++)
		{
			if(primes[i]==true)
			{
				for(int j=i*i;j<=size;j=j+i)
				{
					primes[j]=false;
				}
			}
		}
		
		//System.out.println(Arrays.toString(primes));
		
	 //  int prefix[]=new int[size];
	   
		if(primes[n]==true)
		{
			System.out.println(n+" is prime");
		}
		else
		{
			System.out.println(n+" is not prime");
		}
		
			

	}

}
