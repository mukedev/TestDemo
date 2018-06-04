package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//测试随机验证码(数字不会重复)
public class TestRandomList {

	public static void main(String[] args) {
		// 方法一
		String[] beforeShuffle = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		List<String> list = Arrays.asList(beforeShuffle);
		Collections.shuffle(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		String afterShuffle = sb.toString();
		String result = afterShuffle.substring(3, 7);
		// System.out.println(result);

		// 方法二
		String s = ((int) (Math.random() * (9999-1000+1)) + 1000) + "";
		System.out.println(s);
	}
}
