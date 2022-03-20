package owl;
import java.util.*;

public class Find_Ele_Binary 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
	    int l=0;
	    int count=0;
	    int h=N-1;
	    boolean status=false;
	    while(l<=h)
	    { 
	    	int m=(l+h)/2;
	    	if(arr[m]>target)
	    	{
	    		h=m-1;
	    		
	    		//System.out.println(h);
	    	}
	    	if(arr[m]==target)
	    	{
	    		
	    		count=1;
	    		break;
	    	}
	    	if(arr[m]<target)
	    	{
	    		l=m+1;
	    		//System.out.println(h);
	    	}
	    }
	    if(count==0)
	    {
	    	System.out.println("element not found ");

	    } 
	    else
	    {
	    	System.out.println("Element found ");
	    }

	}

}
