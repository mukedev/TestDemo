package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//对象排序，实现接口
class Student implements Comparable<Student> {
    String name;
	Integer age;
	Integer score;

	public Student(String name, Integer age, Integer score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		// 排序规则与字段,此为升序
		return this.age-o.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}

public class ObjSort {
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
		Collections.sort(students);
		System.err.println("排序后：");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
