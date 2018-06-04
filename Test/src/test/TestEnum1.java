package test;

enum Color {
	GREEN, RED, YELLOW, White
}

/**
 * 
 * @Function:TestEnum
 * @Description: 枚举作用于switch
 * @author zhangyu
 * @date :2018/04/10上午11:00:09
 *
 */
public class TestEnum1 {
	Color color = Color.White;

	public static void main(String[] args) {

		TestEnum1 testEnum = new TestEnum1();
		System.out.println(testEnum.change());

	}

	public Color change() {
		switch (color) {

		case GREEN:
			color = Color.GREEN;
			break;
		case RED:
			color = Color.RED;
			break;
		case YELLOW:
			color = Color.YELLOW;
			break;
		case White:
			color = Color.White;
			break;
		}
		return color;
	}
}
/*
 * White
 */
