package test;

import java.util.Stack;

//两个栈组成一个队列2018/04/04
public class TestStack<T> {
	    private Stack<T> stack1 ;
	    private Stack<T> stack2 ;

	    public TestStack(){
	        stack1 = new Stack<T>();
	        stack2 = new Stack<T>();
	    }

	    //入队
	    public void enqueue(T item){
	        stack1.push(item);
	    }

	    //出队
	    public T dequeue(){
	        if (stack1.size() < 1 && stack2.size() < 1)
	        {
	            System.out.println("Queue is empty");
	            return null;
	        }
	        //把stack1清空
	        while (stack1.size() > 1){
	           T element = stack1.pop();
	           stack2.push(element);
	        }
	        T ele = stack1.pop();
	        //把stack2 清空
	        while (stack2.size() > 0){
	            T element = stack2.pop();
	            stack1.push(element);
	        }
	        return ele;
	    }

	    public static void main(String[] args){
	    	TestStack gfg = new TestStack();
	        gfg.enqueue("我的");
	        gfg.enqueue("名字");
	        gfg.enqueue("叫");
	        gfg.enqueue("顶级程序员不穿女装");
	        gfg.enqueue("微博:https://m.weibo.cn/p/1005056186766482");
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	        System.out.print(gfg.dequeue());
	    }
	

}
