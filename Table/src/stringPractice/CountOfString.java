package stringPractice;

public class CountOfString {
	
	public static void main(String[] args) {
		
		String s= "AKSHAY NIMGIRE";
		
		for (int i=0; i<s.length(); i++)
		{
			char c= s.charAt(i);
			
			System.out.println("char at "+c+ " is ind of "+i);
		}
 	}

}
