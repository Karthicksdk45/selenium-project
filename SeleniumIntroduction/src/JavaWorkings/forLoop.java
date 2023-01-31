package JavaWorkings;

public class forLoop {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,9,10,15,18,21,1444};
		
		System.out.println("For loop output data : ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Print only even numbers : ");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
