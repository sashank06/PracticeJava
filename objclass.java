package samples;
import java.util.*;
class array
{
	int i,m,n;
	
	void initialize()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter 1st array");
		m=in.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		System.out.println("enter first array");
		for(i=0;i<m;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<m;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter 2nd array");
		for(i=0;i<m;i++)
		{
			b[i]=in.nextInt();
		}
		for(i=0;i<m;i++)
		{
			System.out.println(b[i]);
		}


	}

}
public class objclass
{
	public static void main(String[] args)
	{
		array a=new array();
		a.initialize();
		
	}
}
