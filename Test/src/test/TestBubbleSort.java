package test;

//冒泡排序
public class TestBubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 6, 55, 8, 22, 1, 5, 7, 5, 6, 5, 78, 9, 15, 18, 11 };
		int index;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) { // j必须每次都从0开始
				if (array[j] > array[j + 1]) {
					index = array[j];
					array[j] = array[j + 1];
					array[j + 1] = index;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(+array[i] + "\t");
		}
	}
}
