package samples;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean yes = false ;
		for(int i=2;i<n;i++){
			if( n % i == 0){
				yes = true;
			}
			/*else{
				yes = false;
			}*/
			
		}
		if(yes){
			System.out.println("not prime");
		}
		else
			System.out.println("prime");
	}
}
