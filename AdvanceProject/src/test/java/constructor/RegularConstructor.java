package constructor;

public class RegularConstructor {
   
 	public RegularConstructor(){
		
		System.out.println("I am a special type of mehtods");
	}
 	
 	public void getSalary() {
 		
 		System.out.println("I am not a constructor");
 	}
	
 	public static void main(String[] args) {
		
 		RegularConstructor obj = new RegularConstructor();
 		obj.getSalary();
 		
	}
 
}
