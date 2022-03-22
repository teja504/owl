package owl;

import java.util.Scanner;

public class Lcm 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers ");
		
		int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=1;
        int a=n1;
        
        for(int i=2;i<=n1;i++)
        {
        	
        	if(n1%i==0 && n2%i==0)
        	{
        	    n1=n1/i;
        	    n2=n2/i;
        	    lcm=lcm*i;
        	    i--;
        	    
        	}
        	
        }
        System.out.println(lcm*n1*n2);
		
		
	  
	}

}
