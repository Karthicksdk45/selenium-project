package JavaWorkings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArray {

	public static void main(String[] args)
	{
		String[] a = {"b","c","a"};
		
		//List<String> lst = rev(a);
		
		//Collections.reverse(lst);
		
		//coll(a);
		
		numToChar();
		
		//System.out.println(lst);
		
//		System.out.println(Arrays.toString(a));
//		
//		Arrays.sort(a);
//		
//		System.out.println(Arrays.toString(a));
		
	}
	
	public static List<String> rev(String[] a)
	{
		List<String> lst = new ArrayList<>();
		
		Collections.addAll(lst, a);
		
		System.out.println(lst);
		
		Collections.reverse(lst);
		
		System.out.println(lst);
	
		return lst;
	}
	
	public static void coll(String[] a)
	{
		System.out.println(Arrays.toString(a));
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void numToChar()
	{
		String a = "a1b2c3";
		
		for(int i=0;i<a.length();i++)
		{
			if(Character.isAlphabetic(a.charAt(i)))
			{
				System.out.print(a.charAt(i));
			}
			else {
				int num = Character.getNumericValue(a.charAt(i));
				for(int j=0;j<num;j++)
				{
					System.out.print(a.charAt(i-1));
				}
			}
		}
	}
}
