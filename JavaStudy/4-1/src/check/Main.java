package check;
import constants.Constants;

public class Main {
	private static String firstName= "青鹿";
	private static String lastName = "渓";
	
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド → "+ firstName + lastName);
	}
	public static void main(String[] args) { 
	    printName(firstName,lastName);
		
		Pet pet1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet1.introduce();
		RobotPet robotPet1 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotPet1.introduce();	
		}
}
