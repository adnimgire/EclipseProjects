package array;

import java.util.stream.IntStream;

public class No1to100
{

//	public static void hundred(int a)
//	{
//		if(a<=100)
//		{
//			System.out.println(a);
//			a++;
//			hundred(a);
//		}
//	}
	
	
	public static void printnum(int stnum, int endnum)
	{
		if(stnum<=endnum)
		{
			System.out.println(stnum);
			stnum++;
			printnum(stnum, endnum);
		}
	}
	
	
		
	public static void main(String[] args)
	{
		
		
//		hundred(1);
		
		printnum(1,100);
		
//		IntStream.range(1, 101).forEach(e->System.out.println(e));
		
	}
	
	
}
