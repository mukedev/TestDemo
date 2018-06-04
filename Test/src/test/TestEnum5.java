package test;

/**
 * 
 * @Function:TestEnum5
 * @Description: 覆盖枚举的方法
 * @author zhangyu
 * @date :2018/04/10下午12:06:54 ================================在本类不能实例化(不知原因)
 */
public enum TestEnum5 {
	RED("红色", 1), GREEN("绿色", 2), YELLOW("黄色", 3);

	private String color;
	private int index;

	// 我的理解是，枚举常量内的参数(描述)需要跟这个私有的构造器参数一致
	private TestEnum5(String color, int index) {
		this.color = color;
		this.index = index;
	}

	public String getColor() {
		return color;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public String toString() {
		return this.index + " _color:" + this.color;
	}

	public static String getInstance(int index) {
		for (TestEnum5 s : TestEnum5.values()) {
			if (s.getIndex() == index) {
				// 入果去掉重写toString方法，则返回RED
				return s.toString();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(getInstance(2));
	}
}
/*
 * 2 _color:绿色
 */
