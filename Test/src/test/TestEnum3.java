package test;

/**
 * 
 * @Function:TestEnum3
 * @Description:ö�ٶ�̬�ԣ���ӳ��󷽷�
 * @author zhangyu
 * @date :2018/04/10����11:04:27 ����javac **.java �������� javap **
 *       ��������֣�"ö�ٳ���"�̳���TestEnum3��д�˳��󷽷�,����java.lang.Enum���������࣬����������Ϊ������
 */
public enum TestEnum3 {
	GREEN {
		void discription() {
			System.out.println("�̵��У�");
		}
	},
	RED {
		void discription() {
			System.out.println("���ͣ��");
		}
	},
	YELLOW {
		void discription() {
			System.out.println("�ƵƵ�һ�ȣ�");
		}
	};
	abstract void discription();

	public static void main(String[] args) {
		for (TestEnum3 s : TestEnum3.values()) {
			s.discription();
		}
	}
}
/*
 * �̵��У�
 * ���ͣ��
 * �ƵƵ�һ�ȣ�
 */
