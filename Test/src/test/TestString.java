package test;

public class TestString {

	private static String getSubStr(String str, int num) {
		int i = 0; 
		while (i < num) {
			int lastFirst = str.lastIndexOf('.');
			str = str.substring(0, lastFirst);
			i++;
		}
		return str.substring(0);
	}

	public static void main(String[] args) {
		String str = "parents.0.parents.1.children";
		int num = 2*2;//前一个2代表层数-->两层,一层需要清除两个“.”
		
		getSubStr(str, num);
	}

}
