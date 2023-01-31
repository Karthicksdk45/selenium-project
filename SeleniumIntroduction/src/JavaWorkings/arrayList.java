package JavaWorkings;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList();
		list.add("SDK");
		list.add("MADOO");
		list.add("GOW2");
		list.add("KARTHI");
		//System.out.println(list.get(3));
		
		//Print all the values using the for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		//Print in the reverse order
		System.out.println();
		System.out.println("Print in the reverse order : ");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.stream().sorted().forEach(s->System.out.print((s)+" "));
		
	}

}
