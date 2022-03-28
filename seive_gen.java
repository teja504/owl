package owl;

import java.util.*;

public class seive_gen 
{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	Math.round(n);
		int size=100;
		boolean primes[]=new boolean[size];
		Arrays.fill(primes,true);
		//double i,j;
		
		
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
