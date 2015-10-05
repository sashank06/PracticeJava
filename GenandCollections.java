package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenandCollections {
public static void main(String[] args) {
	List<Double> abc =  Arrays.asList(1.1,2.1,3.1);
	System.out.println(sum(abc));
	System.out.println();
	
}

private static int sum(Collection<? extends Number> abc) {
	// TODO Auto-generated method stub
	int s= 0;
	for(Number n:abc)
		s += n.doubleValue();
	return s;
	
}
}
