package JavaWorkings;

import java.util.Arrays;
import java.util.List;

public class convertArraytoList {

	public static void main(String[] args) 
	{
		String frds[] = {"SDK","MADOO","GOW2","KARTHI"};
		System.out.println("Arrays: "+Arrays.toString(frds));
		
		List<String> list = Arrays.asList(frds);
		
		System.out.print(list);
		
		
	}

}
