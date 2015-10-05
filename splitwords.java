package samples;

 
 
import java.util.ArrayList;
 
public class splitwords
{
    public static String[] split(String sIn)
    {
        ArrayList<String> wordList = new ArrayList<String>();
        
        sIn = sIn.trim();
        int curIndex = 0;
        boolean done = false;
        char[] chars = sIn.toCharArray();
        int length = sIn.length();
        
        while (!done)
        {
            int found = sIn.indexOf(' ', curIndex);
            if (found == -1)
            {
                // add last word
                done = true;
                String s = new String(chars, curIndex, length-curIndex);
                wordList.add(s);
            }
            else
            {
                // found a word, add it
                String s = new String(chars, curIndex, found-curIndex);
                wordList.add(s);
                
                curIndex = found;
                
                // skip spaces
                while (curIndex < length)
                {
                    if ( chars[curIndex] != ' ' )
                        break;
 
                    curIndex++;                 
                }
            }
        }
        
        // copy Object array, casting to String
        Object[] temp = wordList.toArray();
        String[] words = new String[temp.length];
        for(int i=0; i<temp.length; i++)
            words[i] = (String)temp[i];
        
        return words;
    }
 
/*  
    public static String[] split14(String sIn)
    {
        // J2SE 1.4 and above support split natively
        String[] temp = sIn.split("\\s");
        
        // need to filter out zero-length strings
        // to match problem statement
        int count = 0;
        for(int i=0; i<temp.length; i++)
        {
            if (temp[i].length() > 0)
                count++;
        }
        
        String[] words = new String[count];
        for(int i=0, j=0; i<temp.length; i++)
        {
            if (temp[i].length() > 0)
            {
                words[j++] = temp[i];
            } 
        }
        return words;
    }       
*/  
    public static void main(String[] args)
    {
        String testStr = "This is a test,      this is only a test.";
        String[] words = split(testStr);
 
        System.out.println(testStr);
        System.out.println("Word count: " + words.length);
        for(int i=0; i<words.length; i++)
        {
            System.out.println("word: " + words[i]);
            System.out.println("length: " + words[i].length());
            System.out.println();
        }
    }
}







