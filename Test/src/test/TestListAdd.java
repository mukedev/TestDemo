package test;

import java.util.ArrayList;
import java.util.List;

public class TestListAdd {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0, "a");
		list.add(0, "b");
		list.add(0, "c");
		for (String string : list) {
			System.out.println(string);
			// c
			// b
			// a
		}
	}
}
