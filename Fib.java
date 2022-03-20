package owl;

import java.util.Scanner;

public class Fib 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int n=0;
		int m=1;
		int x=0;
		int count=0;
		for(int i=0;i<N;i++)
		{
			x=m+n;
			//System.out.println(x);
			n=m;
			m=x;
			if(x==n || x==m)
			{
				count++;
				break;
			}
		}
		if(count>0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
