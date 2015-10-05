package samples;

import java.util.Scanner;

public class permstring {
	
	public static void main(String[] args){
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		str=in.nextLine();
		perm("",str);
		
	}
	public static void perm(String start,String end)
	{
		if((end.length())==0)
			System.out.println(start+end);
		else
		{
			for (int i=0;i<end.length();i++)
			{
				String new1=end.substring(0,i)+end.substring(i+1);
				//System.out.println(end.charAt(i));
				perm(start+end.charAt(i),new1);
				
			}
		}
	}
}
