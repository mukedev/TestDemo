package test;

/**
 * 
 * @Function:TestEnum
 * @Description: 枚举添加方法
 * @author zhangyu
 * @date :2018/04/10上午11:00:09
 *
 */
public enum TestEnum2 {
	RED("红色", 1), YELLOW("黄色", 2), WHITE("白色", 3);

	private String color;
	private int index;

	// 私有构造方法
	private TestEnum2(String color, int index) {
		this.color = color;
		this.index = index;
	}

	// 通过index获取颜色的静态方法
	public static String getColor(int index) {
		for (TestEnum2 colorObj : TestEnum2.values()) {
			if (colorObj.getIndex() == index) {
				return colorObj.getColor();
			}
		}
		return null;
	}

	public String getColor() {
		return color;
	}

	public int getIndex() {
		return index;
	}

	public static void main(String[] args) {
		System.out.println(getColor(2));
	}
}
/*
 * 黄色
 */
