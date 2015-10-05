package samples;

public class sum2 {
 public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9};
	int target = 15;
	int[] x = new int[4];
x =twoSum(arr,target);
for(int i=0;i<4;i++){
	System.out.println(x[i]);
}
 }
 public static int[] twoSum(int[] numbers, int target) {
	  int[] ret = new int[4];
	  for (int i = 0; i < numbers.length; i++) {
	    for (int j = i + 1; j < numbers.length; j++) {
	       int k =j+1;
	       int l =numbers.length -1;
	       while(k<l){
	    	   int sum = numbers[i] + numbers[j] +numbers[k]+numbers[l];
	    	   if(sum <target){
	    		   k++;
	    	   }
	    	   else if(sum>target){
	    		   l--;
	    	   }
	    	   else if(sum == target){
	    		   ret[0]= numbers[i];
	    		   ret[1] = numbers[j];
	    		   ret[2] = numbers[k];
	    		   ret[3] = numbers[l];
	    		   
	    	   }
	    	   k++;
	    	   l--;
	       	}
	       }
	} 
	
	return ret; 
	}
}
