package test;

/**
 * 
 * @Function:TestEnum5
 * @Description: ����ö�ٵķ���
 * @author zhangyu
 * @date :2018/04/10����12:06:54 ================================�ڱ��಻��ʵ����(��֪ԭ��)
 */
public enum TestEnum5 {
	RED("��ɫ", 1), GREEN("��ɫ", 2), YELLOW("��ɫ", 3);

	private String color;
	private int index;

	// �ҵ�����ǣ�ö�ٳ����ڵĲ���(����)��Ҫ�����˽�еĹ���������һ��
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
				// ���ȥ����дtoString�������򷵻�RED
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
 * 2 _color:��ɫ
 */
