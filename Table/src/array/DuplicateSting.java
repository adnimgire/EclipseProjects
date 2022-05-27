package array;

public class DuplicateSting {
	
	public static void main(String[] args) {
		
		
	String a[]= {"blue","yellow", "red", "green","blue","red","white","black","yellow","white","pink"};
    int b= a.length;
    System.out.println("length of array is = " +b);
    
    for(int i=0; i<a.length; i++)
    {
    	for (int j= i+1; j<a.length; j++)
    	{
    		if (a[i]==a[j])
    		{
    			System.out.println(a[j]);
    		}
    	}
    }
	
	
	
		 		
	
	
	
	
	
	
	
	
	}

}
