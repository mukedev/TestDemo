package test;

enum Colors {
	RED, YELLOW, WHITE, GREEN
}

/**
 * 
 * @Function:TestEnum
 * @Description: 枚举做常量
 * @author zhangyu
 * @date :2018/04/10上午11:00:09
 *
 */
public class TestEnum {

	public static void main(String[] args) {
		for (Colors string : Colors.values()) {
			System.out.println("color:" + string);
		}
		System.out.println("====================");
		for (Colors string : Colors.values()) {
			System.out.println(string + " ordinal " + string.ordinal());
		}
	}
}
/*
 * color:RED 
 * color:YELLOW 
 * color:WHITE 
 * color:GREEN 
 * ==================== 
 * RED ordinal 0 
 * YELLOW ordinal 1 
 * WHITE ordinal 2 
 * GREEN ordinal 3
 */