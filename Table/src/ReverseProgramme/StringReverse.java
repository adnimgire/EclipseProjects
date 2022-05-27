package ReverseProgramme;

public class StringReverse {
	
	public static void main(String[] args) {
		
//		String a= "akshay";
//		String rev="";
//	
//    	
// 		
//		for (int i= a.length()-1; i>=0; i--)
//		{
//			
//			
//			rev=rev+a.charAt(i);
//			
// 		}
//		
//		System.out.println("original string is " +a);
//		System.out.println("reverse string is " +rev);
		
		
		String x="NIMGIRE";
		String r="";
		
		for (int i=x.length()-1; i>=0; i--)
		{
			r= r+x.charAt(i);
			
		}
 		System.out.println(r);
	}

}
