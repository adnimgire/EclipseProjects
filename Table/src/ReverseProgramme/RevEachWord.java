package ReverseProgramme;

public class RevEachWord {
	
	public static void main(String[] args) {
		
		String  s= "AKSHAY NIMGIRE";
		
		String [] f= s.split(" ");
		String r=f[0];
		String h="";
		
		
		for (int i=r.length()-1; i>=0; i--)
		{
 			h= h+r.charAt(i);
		}	
		
		String r1=f[1];
		String h1="";
		
		for (int i=r1.length()-1; i>=0; i--)
		{
			h1= h1+r1.charAt(i);
 		}
 		
		System.out.println(s);
		
		System.out.println(h+" "+h1);
		
 	}

}
