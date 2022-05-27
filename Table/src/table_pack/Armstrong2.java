package table_pack;

public class Armstrong2 {

	public static void main(String[] args) {
		
		
		int n= 153;
		
		int i= 0;
		
		int j;
		
		while (n>0)
		{
			j= n%10;
			i= i+j*j*j;
			n= n/10;
		}
		System.out.println(i);
	
	
	int a= 370;
	int b= 0; 
	int c;
	
	while (a>0)
	{
		c= a%10;
		b= b+c*c*c;
		a= a/10;
	}
	System.out.println(b);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
