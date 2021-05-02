package day3Assignment;

public class UserManager {
	
    public void login(User[] users) {
	int i=0;
		for(User user : users) {
			System.out.println("user "+(i+1)+" id:"+user.id);
			i ++;
		}
	
}
}
