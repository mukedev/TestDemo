package test;

import java.util.Stack;

//����ջʵ�����ƶ���
//���У��Ƚ��ȳ� ��ջ������ȳ�
//������ջ�ĵ�������ƿ�ӣ��Ȱ�Ԫ��ѹ�루push����һ���յ�ջ1��,��ʼ��
public class QueueWithTwoStack<T> {

	// ��������ջ
	private Stack<T> stack1;
	private Stack<T> stack2;

	//��ʼ��ջ
	public QueueWithTwoStack() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();

	}

}
