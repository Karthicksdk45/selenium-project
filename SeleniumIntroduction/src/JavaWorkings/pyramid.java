package JavaWorkings;

public class pyramid {

	public static void main(String[] args)
	{
		/*1 2 3 4
		  5 6 7
		  8 9
		  10*/
		//pyramid(1);
		//System.out.println("Reverse pyramid : ");
		//pyramid1(1);
		pyramid2(1);
	}
	
	public static void pyramid(int c)
	{	
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
	public static void pyramid1(int c)
	{	
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
	public static void pyramid2(int c)
	{	
		for(int i=1;i<=4;i++)
		{
			c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
			
		}
	}

}
