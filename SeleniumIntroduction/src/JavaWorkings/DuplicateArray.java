package JavaWorkings;

import java.util.*;
import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) 
	{
		String[] arr = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i].equals(arr[j]))
//				{
//					
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
		
		//dup();
		
		arr1();
	}
	
	public static void dup()
	{
		String[] arr = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
		
		Collection<String> lst = Arrays.asList(arr);
		Collection<String> lst1 = Arrays.asList("abc1", "def1", "mno1");
		Collection<String> lst2 = new ArrayList<String>(lst);
		Collection<String> lst3 = new ArrayList<String>();
		lst2.retainAll(lst1);
		System.out.println(lst2);
		lst3.addAll(lst);
		lst3.addAll(lst1);
		lst3.removeAll(lst2);
		System.out.println(lst3);
		
		
	}
	
	public static void arr1()
	{
		String[] arr = new String[4];
		
		System.out.println(arr[3]);
		System.out.println(arr);
	}
}
	