package test;

/**
 * 
 * @Function:TestEnum4
 * @Description: ���ù�����Ϊʵ���������
 * @author zhangyu
 * @date :2018/04/10����12:06:54
 *
 */
public enum TestEnum4 {
	RED("��ɫ"), GREEN("��ɫ"), YELLOW("��ɫ"); //ʵΪ������ʵ������

	public String colorFlag;

	// �ҵ�����ǣ�ö�ٳ����ڵĲ���(����)��Ҫ�����˽�еĹ���������һ��
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
 * ��ɫ
 * ��ɫ
 * ��ɫ
 */
