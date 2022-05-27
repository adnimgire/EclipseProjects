package stringPractice;

public class UpperAndLowerConvert 
{

public static void main(String[] args) 
{
	
	String a= "akshay dilip NIMGIRE";
	
	String b= a.substring(0, 6);
	String c= b.toUpperCase();
	
	String d= a.substring(7,12);
	String e= d.toUpperCase();
	
	String f= a.substring(13,20);
	String g= f.toLowerCase();
	
	
	System.out.println(c+e+g);
	
	
	
	String x= "akshAY";
	
	String y= x.substring(0,4);
	String z= y.toUpperCase();
	
	String m= x.substring(4,6);
	String n= m.toLowerCase();
	
	System.out.println(z+n);
	
	
	
}
	
}
