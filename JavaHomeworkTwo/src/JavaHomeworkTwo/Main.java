package JavaHomeworkTwo;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.userName = "aykutsahin";
		student.firstName = "Aykut Şahin";
		
		Instructor instructor = new Instructor();
		instructor.firstName = "Engin";
		instructor.lastName = "Demirog";
		
		
		UserManager userManager = new UserManager();
		
		User [] users = {student, instructor};
		
		userManager.add(users);
		

	}

}
