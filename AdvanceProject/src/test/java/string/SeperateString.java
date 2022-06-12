package string;

public class SeperateString {
	
	public static void main(String[] args) {
		
		String name= "Romicron20122345679";
		String value= name.replaceAll("[^a-z]", "");
		System.out.println(value);
		String Number= name.replaceAll("[^0-2]", "");
		System.out.println(Number);
		
	}

}
