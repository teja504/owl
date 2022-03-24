package owl;

import java.util.Scanner;

public class Product_of_prime {

	public static void main(String[] args) {
		System.out.println("Enter Range Of Prime Numbers");
		Scanner sc=new Scanner(System.in);
	    long L=sc.nextInt();
	    long R=sc.nextInt();
	    double mod=(Math.pow(10, 9)+7);
	    double l=L;
	    double r=R;
		
	    double count=1;
		for (double i=l;i<=r;i++)
		{
			int c=0;
			for (double j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					c=c+1;
				}
			}
			
			if(c==2)
		    {
				count=((count%mod)*(i%mod))%mod;
			
			
		    }
		
		}
		System.out.println(count);


	}

}
