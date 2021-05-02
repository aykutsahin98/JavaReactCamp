package JavaHomeworkTwo;

public class InstructorManager extends UserManager {

	public void addNewCourse (Instructor instructor) {
		System.out.println(instructor.userName +""+instructor.firstName+ ", sisteme yeni bir kurs eklediniz.");
	}
	public void deleteCourse (Instructor instructor) {
		System.out.println(instructor.userName +""+instructor.firstName+ ", sistemden bir kurs sildiniz.");
	}
}
