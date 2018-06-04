package test;

import java.util.Stack;

//两个栈实现类似队列
//队列：先进先出 。栈：后进先出
//把两个栈的当成两个瓶子，先把元素压入（push）到一个空的栈1中,开始：
public class QueueWithTwoStack<T> {

	// 声明两个栈
	private Stack<T> stack1;
	private Stack<T> stack2;

	//初始化栈
	public QueueWithTwoStack() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();

	}

}
