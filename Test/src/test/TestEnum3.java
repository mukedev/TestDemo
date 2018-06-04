package test;

/**
 * 
 * @Function:TestEnum3
 * @Description:枚举多态性，添加抽象方法
 * @author zhangyu
 * @date :2018/04/10上午11:04:27 编译javac **.java ，反编译 javap **
 *       反编译后发现，"枚举常量"继承了TestEnum3重写了抽象方法,此类java.lang.Enum抽象类子类，反编译后此类为抽象类
 */
public enum TestEnum3 {
	GREEN {
		void discription() {
			System.out.println("绿灯行！");
		}
	},
	RED {
		void discription() {
			System.out.println("红灯停！");
		}
	},
	YELLOW {
		void discription() {
			System.out.println("黄灯等一等！");
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
 * 绿灯行！
 * 红灯停！
 * 黄灯等一等！
 */
