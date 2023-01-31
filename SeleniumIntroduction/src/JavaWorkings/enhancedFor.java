package JavaWorkings;

public class enhancedFor {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,9,10,15,18,21,1444};
		
		//Enhanced for loop
		for(int num : a)
		{
			if(num%2==0)
			{	
			System.out.println(num);
			}
		}
	}

}
