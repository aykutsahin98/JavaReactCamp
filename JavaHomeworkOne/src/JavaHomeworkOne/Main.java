package JavaHomeworkOne;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Kurslarým";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Yeni Kurs Satýn Al";
		
		Category [] categories = {category1,category2};
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		Course course1 = new Course(1, "Java Geliþtirme", 50, "Engin Demirog", "Sifirdan Java Ögren");
		Course course2 = new Course(2, "Android Programlama", 250, "Murat Yucedag", "Oyun Gelistirin");
		
		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);

	}

}
