package JavaWorkings;

public class FibonacciSeries
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 1;
		int k=i+j;
		
		System.out.print(i+" "+j+" ");
		
		while((i+j)<500)
		{
			k=i+j;
			System.out.print(k+" ");
			
			i=j;
			j=k;
		}
	}

}
