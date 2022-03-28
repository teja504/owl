package owl;

import java.util.*;

public class Target_index 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter range of array : ");
	   int N=sc.nextInt();
	   int arr[]=new int[N];
	   int n=arr.length;
	   int count=0;
	   System.out.println("enter elements : ");
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   Arrays.sort(arr);
	   System.out.println("Enter Target element ");
	   int target=sc.nextInt();
	   int pos=0;
	   //System.out.println(Arrays.toString(arr));
	
	   for(int i=0;i<n;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   for(int i=0;i<n;i++)
	   {
		   if(arr[i]==target)
		   {
			  
			   count++;
		   }
	   }
	   int arr2[]=new int[count];
	   for(int i=0,j=0;i<n;i++)
	   {
		   if(arr[i]==target)
		   {
		     arr2[j]=i;
		     j++;
		   } 
		   
	   }
	   System.out.println(Arrays.toString(arr2));
	 
   }
}
