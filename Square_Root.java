package owl;
import java.util.*;


public class Square_Root {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	    int l=1;
	    int count=0;
	    int h=N;
	    while(l<=h)
	    { 
	    	int m=(l+h)/2;
	    	if((m*m)>N)
	    	{
	    		h=m-1;
	    		//System.out.println(h);
	    	}
	    	if(m*m==N)
	    	{
	    		System.out.println(m);
	    		count++;
	    		break;
	    	}
	    	if((m*m)<N)
	    	{
	    		l=m+1;
	    		//System.out.println(h);
	    	}
	    }
	    if(count==0)
	    {
	    	System.out.println(h);

	    }
	   // System.out.println(h);

	   
	  

	}

}
