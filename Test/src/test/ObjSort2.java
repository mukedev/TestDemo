package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//�������������ڲ���
public class ObjSort2 {
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
		// �ڲ��෽��
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.score - o2.score;
			}
		});
		;
		System.err.println("�����");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
