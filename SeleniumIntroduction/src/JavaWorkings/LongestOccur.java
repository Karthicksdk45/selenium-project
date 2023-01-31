package JavaWorkings;

import java.util.HashMap;
import java.util.Map;

public class LongestOccur {

	public static void main(String[] args)
	{
		int[] j = {1,3,2,4,1,2,4,6,8,2,1,5,6,8,0,1,2,1,1};
		Map<Integer,Integer> mp = new HashMap<>();
		
		int c=0;
		
		for(int i=0;i<j.length;i++)
		{
			c=0;
			for(int k=0;k<j.length;k++)
			{
				if(j[i]==j[k])
				{
					c++;
					mp.put(j[i], c);
				}
			}
		}
		System.out.println(mp);
	}
	
}
