package newpackage;

public class Palindrome {
	
	// MOM, DAD, POOP CAR
	
	public static void main(String[] args) {
		
		String a = "MOM";
		String reverse =" ";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			reverse +=a.charAt(i);
			System.out.println(reverse);
		}
		boolean palindrome = true;
		/*
		 * for(int i=0; i<a.length(); i++) { System.out.println(i); }
		 */
			
		if(palindrome) {
			System.out.println("It is Palindrome");
			
		}else {
			System.out.println("This is not Palindrome");
		}
	}

}
