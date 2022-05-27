package table_pack;


public class Armstrong_no {

	public static void main(String[] args) {
		
		int n= 370; 
		
		int i=0;
		
		int j;
		
		while (n>0)
		{
			j= n%10;
			i= i+j*j*j;
			n= n/10;
		}
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
	}
}
