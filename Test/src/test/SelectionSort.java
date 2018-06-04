package test;

//选择排序
public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 6, 55, 8, 22, 1, 5, 7, 5, 6, 5, 78, 9, 15, 18, 11 };

		int numi;
		// 思路：找到最小的，之后与未排序的第一个比较
		for (int i = 0; i < array.length; i++) {
			int index = i;
			int num = array[i];
			for (int j = i; j < array.length; j++) {
				// 找到最小值
				if (array[j] < num) {
					num = array[j];
					index = j;
				}
			}
			numi = array[i];
			array[i] = array[index];
			array[index] = numi;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

}
