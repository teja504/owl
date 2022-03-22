package owl;

import java.util.Scanner;

public class Rev_String {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int size=s.length();
		String rev="";
		for(int i=size-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		

	}

}
