package owl;
import java.util.*;

public class Pens {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int R=sc.nextInt();
		int K=sc.nextInt();
		int C=sc.nextInt();
		int l=1;
		int h=N;
		int a=0;
		while(l<=h)
		{
			int m=(l+h)/2;
			a=R+(N-m)*K;
			if(a/C>=m)
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
		}
		System.out.println(h);

	}

}
