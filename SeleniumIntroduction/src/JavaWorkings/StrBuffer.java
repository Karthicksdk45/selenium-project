package JavaWorkings;

public class StrBuffer {

	public static void main(String[] args) 
	{
		String str = "sdk";
		
		StringBuffer rev = new StringBuffer(str);
		
		System.out.println(rev.reverse());
		
		rev.append("45");
		
		System.out.println(rev);
		
		rev.insert(0, "anu");
		
		System.out.println(rev);
		
		System.out.println(rev.capacity());
		
		System.out.println(rev);
	}

}
