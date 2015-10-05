package samples;

public class stringmanip {
	public static void main(String[] args)
	{
		String str=new String("ABBBCC");
		int n=str.length();
		System.out.println("the initial string is :" + str);
		rep(str,n);
		
	}

	private static void rep(String str, int n) {
		String rep="";
		n=str.length();
		char first;
		char second;
		
		for (int i=0;i<n-1;i++)
		{
			System.out.println(i);
			first=str.charAt(i);
			second=str.charAt(i+1);
			rep=first + "" + second;
			//rep=str.substring(i, 2);
			System.out.println(rep);
			if (rep.equals("AA"))
			{
				System.out.println("true");
				str.replace(first, 'b');
				i++;
				System.out.println(str);
				break;
				
				
			}
			
		}
		
		
	}

}
