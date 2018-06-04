package test;

import java.util.Stack;

//����ջ���һ������2018/04/04
public class TestStack<T> {
	    private Stack<T> stack1 ;
	    private Stack<T> stack2 ;

	    public TestStack(){
	        stack1 = new Stack<T>();
	        stack2 = new Stack<T>();
	    }

	    //���
	    public void enqueue(T item){
	        stack1.push(item);
	    }

	    //����
	    public T dequeue(){
	        if (stack1.size() < 1 && stack2.size() < 1)
	        {
	            System.out.println("Queue is empty");
	            return null;
	        }
	        //��stack1���
	        while (stack1.size() > 1){
	           T element = stack1.pop();
	           stack2.push(element);
	        }
	        T ele = stack1.pop();
	        //��stack2 ���
	        while (stack2.size() > 0){
	            T element = stack2.pop();
	            stack1.push(element);
	        }
	        return ele;
	    }

	    public static void main(String[] args){
	    	TestStack gfg = new TestStack();
	        gfg.enqueue("�ҵ�");
	        gfg.enqueue("����");
	        gfg.enqueue("��");
	        gfg.enqueue("��������Ա����Ůװ");
	        gfg.enqueue("΢��:https://m.weibo.cn/p/1005056186766482");
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	    }
	

}
