package samples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class factors {
	
	static int superPower(int z){
		double sqvar=(Math.sqrt((double) z));
		if(Math.floor(sqvar)==sqvar)
            return 1;
		for (int i=(int) sqvar;i>1;i--)
		{
			int temp=2;
			int power;
			power=(int) (Math.pow(i, temp));
			while(power <= z)
			{
				if(power==z)
					return 1;
			
			temp++;
			 power=(int) (Math.pow(i,temp));
		    }
        }
		return 0;
		
	}
	public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        //final String fileName = System.getenv("OUTPUT_PATH");
	        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	        int _z;
	        _z = Integer.parseInt(in.nextLine());
	        
	        res = superPower(_z);
	        System.out.println(res);
	       // bw.write(String.valueOf(res));
	        //bw.newLine();
	        
	        //bw.close();
	    }
}