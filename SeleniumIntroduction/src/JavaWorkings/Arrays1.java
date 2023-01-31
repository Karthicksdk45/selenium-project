package JavaWorkings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays1 {

	public static void main(String[] args)
	{
		//Declare an array
		Integer arr[] = new Integer[3];
		
		arr[0] = 3;
		arr[2] = 1;
		arr[1] = 2;
		//arr[3] = 5;
		//arr[4] = 9;
		
//		/*for(Integer num : arr)
//		{
//			System.out.println(arr[num]);
//		}*/
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
//		
////		arr[1] = 21;
////		
////		for(int i=0;i<arr.length;i++)
////		{
////			System.out.println(arr[i]);
////		}
//		
//		Arrays.sort(arr);
//		
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
//		
		//System.out.println(Arrays.toString(arr));
		//lar(arr);
	}
	
	public static void lar(Integer[] val)
	{
		int temp=0;
		for(int i=0;i<val.length;i++)
		{
			for(int j=i+1;j<val.length;j++)
			{
				if(val[i]<val[j])
				{
					temp=val[i];
					val[i]=val[j];
					val[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(val));
	}
	
}