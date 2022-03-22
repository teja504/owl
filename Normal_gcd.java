package owl;

import java.util.Scanner;

public class Normal_gcd 
{
      public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers ");
		
		int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd=0;
        int max=Math.max(x, y);
        
        for(int i=1;i<max;i++)
        {
           if(x%i==0 && y%i==0)
           {
        	   gcd=i;
           }
        	
        }
        System.out.println(gcd);	
		
		
	}

}
