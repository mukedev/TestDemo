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
 * @Description: ʹ�ýӿ���֯ö��
 * @author zhangyu
 * @date :2018/04/10����1:44:46
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
		// ���ʵ�ֽӿڣ�����֯ö�٣��򵥽������Ƿ���ɡ��������ʹ��ö�ٵĻ�����ô�ɣ���д�����ʱ�򣬾ͺܷ����������
		// ���о��Ǹ�����̬���Ĺ��ܰɣ�
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