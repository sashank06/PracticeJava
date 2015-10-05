package samples;

import java.util.Scanner;

public class Checking {
	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
		 int print=0;
		 int n;
		 System.out.println("enter number");
		 n=in.nextInt();
		 int[] a=new int[n];
		 if(n%2==0){
			 print=0;
			 for(int i=0;i<a.length;i++){
				 print+=2;
				 System.out.println(print);
			 }
		 }
		 else {
			 System.out.println(print=1);
			 for(int i=0;i<a.length;i++){
				 print+=2;
				 System.out.println(print);
			 }
		 }
	}

}
