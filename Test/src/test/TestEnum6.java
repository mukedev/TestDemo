package test;

interface Color6 {
	void print();

	String getColor();
}

/**
 * 
 * @Function:TestEnum6
 * @Description: 枚举实现接口
 * @author zhangyu
 * @date :2018/04/10下午1:44:46
 *
 */
public enum TestEnum6 implements Color6 {
	RED("红色", 1), GREEN("绿色", 2), YELLOW("黄色", 3);

	private String color;
	private int index;

	private TestEnum6(String color, int index) {
		this.color = color;
		this.index = index;
	}

	@Override
	public void print() {
		//补充：this.name 可以返回此枚举常量名称
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
 *  1 color:红色
 *	2 color:绿色
 *	3 color:黄色
*/
