package check;

import constants.Constants;

public class Main {
	private String firstName ;
	private String lastName ;
	
	private void printName( String firstName, String lastName ) {
		this.firstName = firstName;
		this.lastName = lastName;
		String fullName = firstName + lastName;
		System.out.println("printNameメソッド→" + fullName);
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.printName("横山", "佳奈");
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}

}
