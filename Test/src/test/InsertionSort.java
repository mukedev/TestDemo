package test;

//��������(ԭ���ֳ��������飬һ��������һ��δ����Ȼ�����Ųλ�ò���)
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 6, 55, 8, 22, 1, 5, 7, 5, 6, 5, 78, 9, 15, 18, 11 };

		for (int i = 1; i < array.length; i++) { // ��1��ʼ����λ��0�����Ѿ��ź��� //δ����
			int temp = array[i]; // �ȱ��� =array[j+1]
			int j = i - 1;
			while (j >= 0 && temp < array[j]) { // ������
				array[j + 1] = array[j]; // ��ǰһ����ֵ������һ��λ�ã�ǰ�棨array[j]�����ǡ���λ���ˡ�
				j--;
			}
			array[j + 1] = temp; // �����λ�ã�����whileѭ����λ�ã�
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(+array[i] + "\t");
		}

	}
}
