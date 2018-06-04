package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//对象排序，匿名内部类
public class ObjSort2 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("来福", 18, 88));
		students.add(new Student("天磊", 15, 66));
		students.add(new Student("大旺", 18, 80));
		students.add(new Student("老财", 21, 77));
		students.add(new Student("得志", 19, 75));
		students.add(new Student("天明", 17, 90));

		System.err.println("排序前：");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		// 内部类方法
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.score - o2.score;
			}
		});
		;
		System.err.println("排序后：");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
