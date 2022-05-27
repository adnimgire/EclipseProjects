package palindrom;

public class StringPalindrom {

	public static void main(String[] args) {

//		String j = "dog";
//		String rev = "";
//
//		for (int i = j.length() - 1; i >= 0; i--) {
//			rev = rev + j.charAt(i);
//		}
//		System.out.println("orignal string = " + j);
//
// 
//		System.out.println("reverse string = " + rev);

 
//		if (j.equals(rev)) {
//			System.out.println("string is palindrom = " + j);
//		}
//
//		else {
//			System.out.println("string is not palindrom = " + j);
//		}
//
// 
		String a = "nitin";
		String REV = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			REV = REV + a.charAt(i);
		}
		System.out.println("original string = " + a);

 
		System.out.println("reverse string = " + REV);

 
		if (a.equals(REV)) {
			System.out.println("string is palindrome = " + a);
		}

		else {
			System.out.println("string is not palindrome = " + a);
		}

	}

}
