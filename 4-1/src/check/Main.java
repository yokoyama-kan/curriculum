package check;

public class Main {
//	private String firstName = "横山";
//	private String lastName = "佳奈";
	
	private static void printName(String firstName,String lastName) {
		String fullName = firstName + lastName;
		System.out.println(fullName);
	}
	
	
	
	public static void main(String[] args) {
		printName("横山","佳奈");
		
		Pet pet = new Pet("java吉", "hoge");
		pet.introduce();
		
		RobotPet robot = new RobotPet("R2D2", "ルーク");
		robot.introduce();
	}
	
	
}
