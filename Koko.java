package owl;
import java.util.*;
public class Koko 
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
		Arrays.sort(arr);
		int K=sc.nextInt();
		int l=1;
		int h=arr[N-1];
		
		
	    while(l<=h)
	    {
	    	
	    	int m=(l+h)/2;
	    	int sum=0;
	    	for(int i=0;i<N;i++)
	    	{
	    		
	    		if(arr[i]%m==0)
	    		{
	    			sum+=arr[i]/m;
	    		}
	    		else
	    		{
	    			sum+=(arr[i]/m)+1;
	    		}	
	    	}
	    	if(sum<=K)
	    	{
	    		h=m-1;
	    	}
	    	else
	    	{
	    		l=m+1;
	    	}
	    	
	    }
	    
	    System.out.println(l);
	}
	

}
