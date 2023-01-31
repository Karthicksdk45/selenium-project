package JavaWorkings;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

	public static void main(String[] args)
	{
		//String str = "This is Java best programming language always in market";
		
		String str="abcdabkadch";
		
		int len = str.length();
		
		int count=0;
		
		char[] ch = str.toCharArray();
		
		//int i = Integer.parseInt(str);
		
		//System.out.println(i);
		
		Map<Character,Integer> mp = new HashMap<>();
		//Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i=0;i<len;i++)
		{
			count=0;
			for(int j=0;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			mp.put(ch[i], count);
			
		}
		System.out.println(mp);
	}
}
