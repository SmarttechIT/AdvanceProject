package constructor;

public class ParameterConstructor {
	
	String stdName;
	int stdRoll;
	
	public ParameterConstructor(String StudentName, int Roll){
		
		stdName = StudentName;
		stdRoll = Roll;
		
	}
	
	public static void main(String[] args) {
	
		ParameterConstructor obj = new ParameterConstructor("Rahima123", 1003);
		System.out.println(obj.stdName);
		System.out.println(obj.stdRoll);
	}

}
