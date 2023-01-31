package JavaWorkings;

import java.util.Arrays;

public class multiDimArray {

	public static void main(String[] args)
	{
		int a[][] = new int[2][3];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				//System.out.println(a[i][j]);
			}
		}
		System.out.println(Arrays.toString(a));
		
		//int a[][] = {{2,4,5},{3,0,7},{1,2,9}};
		
		//Find the min num
		
		/*
		 * 2 4 5
		 * 3 0 7
		 * 1 2 9
		 */
		
		//Find the column of min num
		
		//Find the mx in the col
//		int min = a[0][0];
//		int max = a[0][0];
//		int col=0;
//		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				if(a[i][j]<min)
//				{
//					min=a[i][j];
//					col=i;
//				}
//			}
//		}
//		System.out.println(min);
//		int k=0;
//		while(k<3)
//		{
//			if(a[col][k]>max)
//			{
//				max=a[col][k];
//			}
//			k++;
//		}
//		System.out.println(max);
	}
	
	
}
