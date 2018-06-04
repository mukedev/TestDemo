package test;

/**
 * 
 * @Function:TestEnum4
 * @Description: 利用构造器为实例添加描述
 * @author zhangyu
 * @date :2018/04/10下午12:06:54
 *
 */
public enum TestEnum4 {
	RED("红色"), GREEN("绿色"), YELLOW("黄色"); //实为类对象的实例引用

	public String colorFlag;

	// 我的理解是，枚举常量内的参数(描述)需要跟这个私有的构造器参数一致
	private TestEnum4(String flag) {
		this.colorFlag = flag;
	}

	public String getColorFlag() {
		return colorFlag;
	}

	public static void main(String[] args) {
		for (TestEnum4 s : TestEnum4.values()) {
			System.out.println(s.getColorFlag());
		}
	}

}
/*
 * 红色
 * 绿色
 * 黄色
 */
