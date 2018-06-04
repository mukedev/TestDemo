package test;

//插入排序(原理：分成两个数组，一个已排序，一个未排序，然后就是挪位置插入)
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 6, 55, 8, 22, 1, 5, 7, 5, 6, 5, 78, 9, 15, 18, 11 };

		for (int i = 1; i < array.length; i++) { // 从1开始，把位置0当成已经排好序 //未排序
			int temp = array[i]; // 先保存 =array[j+1]
			int j = i - 1;
			while (j >= 0 && temp < array[j]) { // 已排序
				array[j + 1] = array[j]; // 把前一个的值赋给后一个位置，前面（array[j]）就是“空位置了”
				j--;
			}
			array[j + 1] = temp; // 插入的位置（最后进while循环的位置）
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(+array[i] + "\t");
		}

	}
}
