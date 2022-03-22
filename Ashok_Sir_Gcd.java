package owl;

import java.util.*;

public class Ashok_Sir_Gcd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers ");
		
		int x=sc.nextInt();
        int y=sc.nextInt();
        int a=Math.min(x,y);
        int b=Math.max(x,y);
        
        if(b%a==0)
        {
        	System.out.println(a);
        }
        else
        {
        	System.out.println(b%a);
        }
        
        
	}

}
