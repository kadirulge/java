package day3Odev;

public class Main {

	public static void main(String[] args) {
		Student kadir = new Student();
		kadir.id = "1234";
		//ceren.assigments = "3.g�n �dev 2";
		
		Instructor engin = new Instructor();
		engin.id ="5678";
			//engin.lecture = "4.g�n 21.30 ders var!";
		
		UserManager userManager = new UserManager();
		User[] users = {kadir,engin};
		
		
		userManager.login(users);
			
	}

}
