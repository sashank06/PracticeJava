package samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solutions {
	

public static int main(String[] args) {
	int count=0;
	int[] a={1,1,1,1,1,1,2};
	for (int i=0;i<a.length;i++){
		for( int j=1;j<a.length;j++){
			if(a[i]==a[j]){
				count++;
				return 0;
				
			}
			
			
		}
	}
	return 1;
	
		}
}
