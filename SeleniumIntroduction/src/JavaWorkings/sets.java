package JavaWorkings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> st = new HashSet<String>();
//		//List<String> st = new ArrayList<>();
//		st.add("hello");
//		st.add("hi");
//		//st.add("hoi");
//		
//		for(int i=0;i<st.size();i++)
//		{
//			//System.out.println(st.get(i));
//		}
		//occur();
		concat();
	}
	
	public static void occur()
	{
		Integer[] i= {1,4,5,1,2,3,4,1,5,6,2,7,4};
		
		Map<Integer,Integer> mp= new HashMap<>();
		
		int c = 0;
		
		for(int j=0;j<i.length;j++)
		{
			c=0;
			for(int k=0;k<i.length;k++)
			{
				if(i[j]==i[k])
				{
					c++;
					mp.put(i[j], c);
				}
			}
			
		}
		System.out.println(mp);
		System.out.println(i.length);
	}
	
	public static void concat()
	{
		String str = "abc";
		String str1 = "cde";
		String str2 = "fgh";
		
		String s = str.concat(str1);
		String n = s.concat(str2);
		//str.concat(str1);
		//str.concat(str2);
		
		System.out.println(n);
		
		StringBuffer s1 = new StringBuffer(str);
	}

}
