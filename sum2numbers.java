package samples;

import java.util.ArrayList;
import java.util.Arrays;

public class sum2numbers {
	public static void main(String[] args) {
	 int[] arr = { 1,2,3,4,5};
	 Arrays.sort(arr);
	 int i,j;
	 sum2val(arr,6);
	 //System.out.println(obj.get(1));
	 
	 
	
}

	private static ArrayList<Integer> sum2val(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i,j;
		ArrayList<Integer> list = null;
		 for(i=0,j=4;i<5;i++,j--){
			 if(arr[i] + arr[j] == n){
				list.add(i);
				list.add(j);
			 }
		 }
		
		return list;
		
	}
}
