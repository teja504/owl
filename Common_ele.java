package owl;
import java.util.*;

public class Common_ele {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of array :");
		int N=sc.nextInt();
		int arr[]=new int[N];
		int pos=0;
		boolean status = false;
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to find : ");
		int a=sc.nextInt(); 
		for(int i=0;i<N;i++)
		{
			if(arr[i]==a)
			{
				status=true;
				pos=i;
				break;
			}
		}
		if(status)
		{
			System.out.println("Elemnt found"+pos);
		}
		else
		{
			System.out.println("Not found");
		}
		

	}

}
