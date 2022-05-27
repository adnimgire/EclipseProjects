package ReverseProgramme;

public class NoReverse {
	
	public static void main(String[] args) {
		
//		int num= 123, temp= num;
//		int i= 0;
//		int j;
//		
//		while(num>0)
//		{
//			j= num%10;
//			i= i*10+j;
//			num= num/10;
//		}
//		System.out.println("original no is = " +temp);
//		System.out.println("reverse no is = " +i);
//		
		
		int n= 321;
	    int	temp=n;
	    int i= 0;
	    int j;
	    
	    while (n>0)
	    {
	    	j= n%10;
	    	i= i*10+j;
	    	n= n/10;
	    }
		
		System.out.println("reverse no is = " +i);
		
//		if(temp==i)
//		{
//			System.out.println(i+" is an pali no");
//		}
//		else
//		{
//			System.out.println(i+" no is not pali");
//		}

		
		
		
	}

}
