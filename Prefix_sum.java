package owl;
import java.util.*;

public class Prefix_sum 
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
	   int prefix[]=new int[N];
	   prefix[0]=arr[0];
	   for(int i=1;i<N;i++)
	   {
		   prefix[i]=prefix[i-1]+arr[i];
		   
	   }
	   int q=sc.nextInt();
	   while(q--!=0)
	   {
		   int l=sc.nextInt();
		   int r=sc.nextInt();
		   if(l==0)
		   {
			   System.out.println(prefix[r]);
		   }
		   else
		   {
			   System.out.println(prefix[r]-prefix[l-1]);
		   }
	   }

	}

}
