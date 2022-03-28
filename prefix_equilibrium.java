package owl;

import java.util.*;

public class prefix_equilibrium 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    int prefix[]=new int[n];
	    prefix[0]=arr[0];
	    for(int i=1;i<n;i++)
	    {
	    	prefix[i]=prefix[i-1]+arr[i];
	    }
	    for(int i=1;i<n-1;i++)
	    {
	    	if(prefix[i-1]==(prefix[n-1]-prefix[i]))
	    	{
	    		System.out.println(i+1);
	    	}
	    }
	    
	    
	    
	    //System.out.println(Arrays.toString(prefix));
	    	
		
	}

}
