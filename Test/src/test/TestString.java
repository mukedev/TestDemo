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
		int num = 2*2;//ǰһ��2�������-->����,һ����Ҫ���������.��
		
		getSubStr(str, num);
	}

}
