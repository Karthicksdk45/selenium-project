package JavaWorkings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection1 {
	public static void main(String[] args)
	{
		int[] arr = {2,7,9,8};
		
		int[] sort;
		
		List<int[]> lst = Arrays.asList(arr);
		
		List<Integer> lst1 = new ArrayList<Integer>();
		
		lst1.add(2);
		lst1.add(1);
		lst1.add(7);
		lst1.add(3);
		
		for(int num : lst1)
		{
			System.out.print(num);
		}
		
		List<Integer> lst2 = lst1.stream().sorted().collect(Collectors.toList());
		System.out.println();
		
		for(int num : lst2)
		{
			System.out.print(num);
		}
		//Java streams
		//List<int[]> lst2 = lst.stream().sorted().collect(Collectors.toList());
		
		/*for(int[] num : lst1)
		{
			System.out.println(num);
		}*/
	}
}
