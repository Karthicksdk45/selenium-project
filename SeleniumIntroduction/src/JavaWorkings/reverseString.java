package JavaWorkings;

public class reverseString {

	public static void main(String[] args)
	{
		String a = "Thaht";
		
		String b="";
		
		//reverse(a.toLowerCase());
		
		getCaps("HelloJavaLoveYOU");
		
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			b=b+a.charAt(i);
//		}
//		if(a.equalsIgnoreCase(b))
//		{
//			System.out.println("It's a palindrome");
//		}
//		else
//		{
//			System.out.println("Not a palindrome");
//		}
	}
	
	public static void reverse(String a)
	{
		StringBuffer rev = new StringBuffer(a);
		
		System.out.println(rev.reverse());
	}
	
	public static void getCaps(String word)
	{
		int c=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)>='A' && word.charAt(i)<='Z')
			{
				System.out.print(word.charAt(i));
				c++;
			}
		}
		System.out.println();
		System.out.println(c);
	}
}
