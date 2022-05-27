package table_pack;

public class Prime_no {
	public static void main(String[] args) {
		
		
		int n= 7;
		
		int a= 0;
		
		for (int i= 2; i<=n-1; i++)
		{
			if (n%i==0)
			{
				a= a+1;
			}
		}
		
		if (a==0)
		{
			System.out.println("prime no is " + n);
		}
		
		else 
		{
			System.out.println("not a prime no" + n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
