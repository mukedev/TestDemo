package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//��������ʵ�ֽӿ�
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
		// ����������ֶ�,��Ϊ����
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
		students.add(new Student("����", 18, 88));
		students.add(new Student("����", 15, 66));
		students.add(new Student("����", 18, 80));
		students.add(new Student("�ϲ�", 21, 77));
		students.add(new Student("��־", 19, 75));
		students.add(new Student("����", 17, 90));

		System.err.println("����ǰ��");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		Collections.sort(students);
		System.err.println("�����");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
