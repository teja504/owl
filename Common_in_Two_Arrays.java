package owl;

import java.util.Arrays;
import java.util.Scanner;

public class Common_in_Two_Arrays 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr1[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		int arr2[]=new int[b];
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String s="";
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
					//s=s+arr1[i];
				}
				
			}
		}
		//System.out.print(s);

	}

}
