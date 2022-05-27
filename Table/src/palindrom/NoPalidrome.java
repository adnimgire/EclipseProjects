package palindrom;

public class NoPalidrome {
	
	public static void main(String[] args) {
		
		int num= 545, temp=num;
		int i=0;
		int j;
		
		while (num>0)
		{
			j= num%10;
			i= i*10+j;
			num= num/10;
		}
		System.out.println("actual no is = "+i);
		
		if(temp==i)
		{
			System.out.println("no is palindrome  " +i);
		}
		else
		{
			System.out.println("no is not palindrome " +i);
		}
		
		
		num= 123;
		int a=0;
		
		while (num>0)
		{
			j= num%10;
		a= a*10+j;
			num=num/10;
		}
		System.out.println("actual no is = "+a);
		
		if (temp==a)
		{
			System.out.println("no is palindrome "+a);
		}
		else
		{
			System.out.println("no is not palindrome "+a);
		}
		
		
	}

}
