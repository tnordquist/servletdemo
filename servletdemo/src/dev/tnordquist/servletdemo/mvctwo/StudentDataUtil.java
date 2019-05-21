package dev.tnordquist.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	static List<Student> getStudents() {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Mary", "Long", "mary@luv2.com"));
		students.add(new Student("Jake", "Cornfield", "jake@luv2.com"));
		students.add(new Student("Randal", "Schmandell", "randy@luv2.com"));
		
		return students;
		
	}

}
