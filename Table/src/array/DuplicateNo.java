package array;

import java.util.Arrays;

public class DuplicateNo {
	
	public static void main(String[] args) {
		
		
//		int a[]= {1,2,3,4,2,5,9,3,1,4,2,3,11,22,33,11,};
//		int b= a.length;
//		
//		for (int i=0; i<a.length; i++)
//		{
//			for(int j= i+1; j<a.length; j++)
//			{
//				if (a[i]==a[j])
//				{
//					System.out.println(a[j]);
//				}
//			}
//		}

	
//	 int x[]= {2,2,3,3,5,5,6,7,8};
//	 int y=x.length;
//	 
//	 for (int i= 0; i<y; i++)
//	 {
//		 for (int j= i+1; j<y; j++)
//		 {
//			 if(x[i]==x[j])
//            {
//	          System.out.println(x[j]);
//            }
//
//		 }
//	 }
//	
	int k[]= {1,1,2,2,55,55,44,68,55,44};
	int r= k.length;
	
	for (int i= 0; i<r; i++)
	{
		for (int j=i+1; j<r; j++)
		{
			if(k[i]==k[j])
             {
	          System.out.println(k[j]);
             }
		}
	}
	
	 
	

	
	}

}
