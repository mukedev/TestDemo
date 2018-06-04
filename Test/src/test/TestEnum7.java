package test;

interface Color7 {

	enum colors1 implements Color7 {
		YELLOW_FRUIT, GREEN_FRUIT, RED_FRUIT
	}

	enum colors2 implements Color7 {
		YELLOW, GREEN, RED
	}
}

/**
 * 
 * @Function:TestEnum6
 * @Description: 使用接口组织枚举
 * @author zhangyu
 * @date :2018/04/10下午1:44:46
 *
 */
public class TestEnum7 implements Color7 {
	public static void testImplInstance() {
		for (Color7.colors1 c1 : Color7.colors1.values()) {
			System.out.println(c1.name());
		}
		System.out.println("==================");
		for (Color7 c2 : Color7.colors2.values()) {
			System.out.println(c2);
		}
		System.out.println("==================");
		// 搞个实现接口，来组织枚举，简单讲，就是分类吧。如果大量使用枚举的话，这么干，在写代码的时候，就很方便调用啦。
		// 还有就是个“多态”的功能吧，
		Color7 color = Color7.colors2.YELLOW;
		System.out.println(color);
	}

	public static void main(String[] args) {
		testImplInstance();
	}
}
/*
 *	YELLOW_FRUIT
 *	GREEN_FRUIT
 *	RED_FRUIT
 *	==================
 *	YELLOW
 *	GREEN
 *	RED
 *	==================
 *	YELLOW
 */