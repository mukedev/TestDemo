package test;

interface Color6 {
	void print();

	String getColor();
}

/**
 * 
 * @Function:TestEnum6
 * @Description: ö��ʵ�ֽӿ�
 * @author zhangyu
 * @date :2018/04/10����1:44:46
 *
 */
public enum TestEnum6 implements Color6 {
	RED("��ɫ", 1), GREEN("��ɫ", 2), YELLOW("��ɫ", 3);

	private String color;
	private int index;

	private TestEnum6(String color, int index) {
		this.color = color;
		this.index = index;
	}

	@Override
	public void print() {
		//���䣺this.name ���Է��ش�ö�ٳ�������
		System.out.println(this.index + " color:" + this.color); 
	}

	@Override
	public String getColor() {
		return this.color;
	}

	public static void main(String[] args) {
		for (TestEnum6 t : TestEnum6.values()) {
			t.print();
		}
	}
}
/*
 *  1 color:��ɫ
 *	2 color:��ɫ
 *	3 color:��ɫ
*/
