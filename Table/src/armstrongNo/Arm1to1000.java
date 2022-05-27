package armstrongNo;

public class Arm1to1000 {
	
	
	public static void main(String[] args) {
		int a= 0,n,b;
		
		System.out.println("armstrong no from 1 to 1000 are =");
		
		for (int i=1; i<=1000; i++)
		{
			n=i;
			while (n>0)
			{
				b= n%10;
				a=a+b*b*b;
				n=n/10;
			}
			
			if (a==i)
			{
				System.out.println(i+" ");
			}
			a=0;
		}
	
	System.out.println( "========================");
	
	int x=0, y, z;
	
	System.out.println("armstrong no from 1 to 10000are =");
	
	for (int i=1; i<=10000; i++)
	{
		y=i;
		while (y>0)
		{
			z= y%10;
			x=x+z*z*z*z;
			y=y/10;
		}
		
		if (x==i)
		{
			System.out.println(i+"");
		}
		x=0;
	}

	
	 
	
	
	
	
	}

}
