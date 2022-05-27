package array;

public class MissingNoArray
{
public static void main(String[] args) 
{
//	int a[]= {1,2,3,4,5,6,8,9};
//	int sum= 0;
//	
//	for(int i=0; i<a.length; i++)
//	{
//		sum= sum+a[i];
//	}
//	
//	System.out.println(sum);
//	
//	int sum1=0;
//	
//	for(int j=1; j<=9; j++)
//	{
//		sum1= sum1+j;
//	}
//	System.out.println(sum1);
//	
//	System.out.println("missing no is::: "+(sum1-sum));
	
	
	//SEGREGATE PROGRAMME
	
	int a[]= {0, 1, 0, 0, 1};
	int j=0;
	for(int i=0;i<a.length;i++)
	
	{
		if(a[i]==0) 
		{
		a[j++]=a[i];
	    }
	}
	while (j<a.length)
	{
		a[j++] = 1;
	}
	
      for (int k=0;k<a.length;k++)
       {
	      System.out.print(a[k]+"  ");
        }
	
	
}
}
