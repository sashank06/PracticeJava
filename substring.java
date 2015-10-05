package samples;

import java.util.Scanner;
 
class SubstringsOfAString
{
   public static void main(String args[])
   {
      String string, sub = null;
      int i, c, length;
      long count = 0;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to print it's all substrings");
      string  = in.nextLine();
 
      length = string.length();   
 
      System.out.println("Substrings of \""+string+"\" are :-");
 
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            sub = string.substring(c, c+i);
            System.out.println(sub);
            if(sub.charAt(0)==(sub.charAt(sub.length()-1)))
				count++;
         }   
			
			
      }
      System.out.println(count);
   }
}