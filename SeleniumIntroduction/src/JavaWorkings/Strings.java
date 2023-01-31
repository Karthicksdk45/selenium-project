package JavaWorkings;

public class Strings {

	public static void main(String[] args) 
	{
		/*String is an object and it represents sequence of characters
		 * 
		 * There are two ways to declare a string
		 * 1.String literals
		 * 2.New keyword
		 */
		String s1 = "sdk 45";
		String s2 = "sdk";
		// Here both are having same values so both are pointing to the same address
		
		String s3 = new String("dk");
		String s4 = new String("dk");
		//Here both are having same values but object are created for both bcoz of using new keyword
		
		String spl[] = s1.split(" ");
		//System.out.print(spl[0]);
		//System.out.print(spl[1]);
		
		//Print it in the character wise
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println("Reversal of string ");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
	}

}
