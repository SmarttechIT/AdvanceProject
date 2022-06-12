package newpackage;

public class SeperateString {
	
	public static void main(String[] args) {
		
		String name = "Omicron2022";
		String value = name.replaceAll("[^A-Za-z]", "");
		System.out.println(value);
		String num = name.replaceAll("[^0-9]", "");
		System.out.println(num);
		
	}

}
