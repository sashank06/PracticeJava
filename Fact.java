package samples;
import java.io.*;
import java.util.*;
public class Fact
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int number=in.nextInt();
		int i=1;
		int value=1;
		if (number==1)
		{
			System.out.println("the factorial is one");
		}
		else if(number<=0)
		{
			System.out.println("cannot find factorial");
		}
		else
		{
			for(i=1;i<=number;i++)
			{
				value=value*i;
			}
			System.out.println(value);
		}
	}

}
