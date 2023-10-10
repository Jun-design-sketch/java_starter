package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(3, "Eve"));

		List<Student> studentAl = new ArrayList<>(students);

		Collections.sort(studentAl);
		System.out.println("Asc" + studentAl);

		Collections.sort(studentAl, new DescendingStudentComparator());
		System.out.println("Desc" + studentAl);

		// OR,
		studentAl.sort(new DescendingStudentComparator());
		System.out.println("Desc" + studentAl);
	}
}
