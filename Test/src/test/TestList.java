package test;


import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		for (String string : getList()) {
			System.out.println(string);
		}
	}
	public static List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		if (2>1) {
			list.remove("2");
		}
		list.add("4");
		return list;
	}
	
}
