package test;

import java.util.Arrays;

public class DichotomyTest {

	public static void main(String[] args) {
		// System.out.println(Sorting(getArray(), 88));
		System.out.println(Sorting(getArray(), 0, getArray().length - 1, 10));
	}

	public static int[] getArray() {
		int[] array = new int[10];
		array[0] = 10;
		array[1] = 15;
		array[2] = 10;
		array[3] = 22;
		array[4] = 18;
		array[5] = 51;
		array[6] = 4;
		array[7] = 21;
		array[8] = 88;
		array[9] = 3;
		Arrays.sort(array);
		return array;
	}

	// 二分查找法（非递归）
	public static int Sorting(int[] array, int code) {
		int len = array.length;
		int start = 0, end = len - 1, mid;
		while (start <= end) {
			mid = (end + start) / 2;// 中间数会渐渐接近指定数
			if (code == 0 || array.length ==0 ) {
				return -1;
			}
			if (array[mid] == code) {
				return mid;
			} else if (array[mid] < code) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	// 递归查找
	public static int Sorting(int[] array, int start, int end, int code) {

		int mid = (start + end) / 2;
		if (code == 0 || array.length ==0 || start>end) {
			return -1;
		}
		if (array[mid] == code) {
			return mid;
		} else if (array[mid] < code) {
			return Sorting(array, mid + 1, end, code);
		} else {
			return Sorting(array, start, end - 1, code);
		}

	}
}
