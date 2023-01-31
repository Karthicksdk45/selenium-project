package JavaWorkings;

public class TestMyForexEye {

	public static void main(String[] args) 
	{
		String s = "?{\"statusCode\":200,\"message\":\"Data Fetched Successfully\",\"data\":{\"value\":82.71,\"spot\":82.745,\"per_name\":\"Cash Spot\",\"premium\":0.035,\"txtname\":\"Last Cash Price\",\"time\":\"02-Jan-23 14:50:51\",\"rateoffered\":\"0\",\"difference\":-82.71,\"profitlosstype\":\"Loss in(Rs)\",\"profitlossvalue\":0,\"margin\":\"0.0\",\"cashtomspotdata\":\"03-01-2023\",\"expimp\":\"Export\",\"minTransDate\":\"01-06-2023\",\"maxTransDate\":\"01-01-2024\"}} ";
		System.out.println(s);
//		
//		String[] a = s.split("{");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		String b = s.replace("?", "");
		
		System.out.println(b);
	}

}
