
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import java.util.stream.*;
import java.util.stream.Stream;

public class StreamWor 
{
	public static void main(String[] args)
		{
			//WebDriver driver = new ChromeDriver();
			
//			ArrayList<String> list = new ArrayList<String>();
//			
//			list.add("sdk");
//			list.add("madoo");
//			list.add("gow2");
//			list.add("mala");
//			list.add("kannan");
//			String startsWith = "m";
//			int count=0;
//			
//			for(String name : list)
//			{
//				System.out.println(name);
//				if(name.startsWith(startsWith))
//				{
//					count++;
//				}
//			}
//			System.out.println("Names starts with "+startsWith+" present in the list are : "+count);
			
			//streamFilter();
			stream();
		
		}

		@Test
		public static void streamFilter()
		{		
			Stream.of("sdk","madoo","gow2","mala","kannan").filter(s->s.startsWith("m")).forEach(s->System.out.println(s));
			Long size = Stream.of("sdk","madoo","gow2","mala","kannan").filter(val->val.startsWith("m")).count();
			System.out.println(size);
			
			//Print names with upper caps
			Stream.of("sdk","madoo","gow2","mala","kannan").filter(val->val.startsWith("m")).map(val->val.toUpperCase()).forEach(val->System.out.println(val));
			Stream.of("sdk","madoo","gow2","mala","kannan").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			System.out.println(Stream.of("Adk","Aadoo","gow2","mala","kannan").filter(s->s.startsWith("A")).count());
			Stream<String> sort = Stream.of("Adk","Aadoo","aow2","mala","kannan").filter(s->s.startsWith("A")).sorted();
			System.out.println(sort);
		}
		
		public static void stream()
		{
			String[] str = {"sdk","madoo","gow2","kerala","mala"};
			/*for(String val : str)
			{
				System.out.println(val);
			}
			*/
			List<String> st = Arrays.asList(str);
			
			System.out.println("Stream Sorting method : ");
			
			st.stream().sorted().forEach(s->System.out.println(s));
			
			st.stream().filter(s->s.startsWith("m")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//st.stream().filter(s->s.startsWith("m")).sorted().map(s->s.).forEach(s->System.out.println(s));
		}
	}

