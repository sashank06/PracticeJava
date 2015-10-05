package samples;




import java.util.ArrayList;
import java.util.Scanner;
 
class test1
{
   public static void  main(String args[])
   {
	   int count=0;
		int[] a={1,1,1,1,1,1,2};
		for (int i=0;i<a.length;i++){
			for( int j=1;j<a.length;j++){
				if(a[i]==a[j])
					count++;	
				}
			if(count==1){
				System.out.println("unique"+a[i]);
			}
			
		}	
		
				
				
			
		
	   /*String string, sub,str="";
      int i, c, length,len,count=0,count1=0;
      ArrayList<String> list1=new ArrayList<String>();
      StringBuffer buff;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");
      string  = in.nextLine();
 
      length = string.length();   
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            sub = string.substring(c, c+i);
            int len1=sub.length();
            if (len1==1)
            {
            	if(!(list1.contains(sub)))
                {
                    list1.add(sub);
                }
            }
            else
            { 
                if(!(list1.contains(sub)))
                list1.add(sub);
            } 
         }
      }
 
      for(i=0;i<list1.size();i++)
      {
    	 String sb=new String();
    	 sb=list1.get(i);
    	 buff=new StringBuffer();
    	 buff.append(sb);
      }
      System.out.println(count);*/
     
   }
}
