package owl;
import java.util.*;


public class Count_Common 
{

	static int lowindex(int arr[],int t)
	{
		int size=arr.length;
		int low=0;
		int upper=arr[size-1];
		while(low<=upper)
		{
			//System.out.println(low+" "+upper);
			int mid=low+(upper-low)/2;
			if(t<=arr[mid])
			{
				upper=mid-1;
			}
			else
			{
				low=mid+1;
			}	
		}
		return low;
	}
	
	static int upperindex(int arr[],int t)
	{
		
		int size=arr.length;
		int low=0;
		int upper=arr[size-1];
		while(low<=upper)
		{
			//System.out.println(low+" "+upper);
			int mid=low+(upper-low)/2;
			if(t>=arr[mid])
			{
				low=mid+1;
			}
			else
			{
				upper=mid-1;
			}
			
		}
		return upper;
	}
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
      int t=sc.nextInt();
      int x=lowindex(arr,t);
      int y=upperindex(arr,t);
      
      for(int i=x;i<y;i++)
      {
    	  System.out.println(i);
      }
      
      
      

	}

}
