package samples;

import java.util.HashMap;
import java.util.Map.Entry;

public class sum2better {
	 public static void main(String[] args) {
			int[] arr = {1,3,5,7,9};
			int target = 14;
			int[] x = new int[2];
		x =twoSum(arr,target);
		System.out.println(x[0]);
		System.out.println(x[1]);
		 }
		 public static int[] twoSum(int[] numbers, int target) {
			  int[] ret = new int[2];
			  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			  for(int i=0;i<numbers.length;i++){
				  if(map.containsKey(numbers[i])){
					  int index = map.get(numbers[i]);
					  ret[0] = index + 1;
					  ret[1] = i+1;
					  break;
				  }
				  else {
				       map.put(target - numbers[i], i);
				  }
			  }

			  for (Entry<Integer, Integer> entry : map.entrySet()) {
			      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			  }
		 return ret;
		 
		 
		 }
}
