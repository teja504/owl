package owl;

import java.util.Scanner;

public class Reaching_Points {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers ");
		
		int sx=sc.nextInt();
        int sy=sc.nextInt();
		int tx=sc.nextInt();
        int ty=sc.nextInt();
        
        while(sx<tx && sy<ty)
        {
        	if(ty>tx)
        	{
        		ty=ty%tx;
        	}
        	else
        	{
        		tx=tx%ty;
        	}
        }
        if(tx==sx)
        {
        	if(sy<=ty)
        	{
        	   if((ty-sy)%sx==0)
        	   {
        	       System.out.println("True");
        	   }
        	}   
        }
        
        else if(ty==sy)
        {
        	if(sx<=tx)
        	{
        	    if((tx-sx)%sy==0)
        	    {
        	       System.out.print("True");
        	    }
        	}
        }
        else
        {
        	System.out.println("False");
        }
        

	}

}
