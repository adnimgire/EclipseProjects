package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuolicateArray
{
	
 public static void main(String[] args)
 {
	
	 int a[]= {1,2,3,3,4,5,5,6,7,7,8,9};
	 
	 // 1. LinkedHashset
	 
	 ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,5,5,6,7,7,8,9 ));
	 
	 LinkedHashSet<Integer> linkhashset= new LinkedHashSet<Integer>(num);
	 
	 ArrayList<Integer> removeduplicate = new ArrayList<Integer>(linkhashset);
	 
	 System.out.println(removeduplicate);
	 
	 
	 //2. Stream
	 
	 ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,5,5,6,7,7,8,9 ));
     
	 List<Integer> uniquevalue = numbers.stream().distinct().collect(Collectors.toList());
	 
	 System.out.println(uniquevalue);
}
		
	 
		
		
	
	
	
	
}
