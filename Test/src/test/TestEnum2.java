package test;

/**
 * 
 * @Function:TestEnum
 * @Description: ö����ӷ���
 * @author zhangyu
 * @date :2018/04/10����11:00:09
 *
 */
public enum TestEnum2 {
	RED("��ɫ", 1), YELLOW("��ɫ", 2), WHITE("��ɫ", 3);

	private String color;
	private int index;

	// ˽�й��췽��
	private TestEnum2(String color, int index) {
		this.color = color;
		this.index = index;
	}

	// ͨ��index��ȡ��ɫ�ľ�̬����
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
 * ��ɫ
 */
