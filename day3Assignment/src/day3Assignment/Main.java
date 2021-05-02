package day3Assignment;

public class Main {

	public static void main(String[] args) {
		Student kadir = new Student();
		kadir.id = "1807";
		
		
		Instructor engin = new Instructor();
		engin.id ="669";
			
		
		UserManager userManager = new UserManager();
		User[] users = {kadir,engin};
		
		
		userManager.login(users);
			
	}

}
