package test;

import java.util.ArrayList;
import java.util.List;

public class TestList2 {
	
	public static void main(String[] args) {
		
		List<Object> rootList =new ArrayList<>();
		rootList.add(1);
		rootList.add(2);
		rootList.add(3);
		rootList.add(4);
		rootList.add(5);
		
		List<Object> inputList = new ArrayList<>();
		inputList.add(2);
		inputList.add(3);
		
		List<Object> removeList = new ArrayList<>();
		
		arrangeData(rootList, inputList, removeList);
		
		
	}
	
	
	public static void arrangeData(List<Object> rootData, List<Object> inputData, List<Object> removeData) {
		//把输入数据全部复制给最后输出的数据
		removeData = new ArrayList<Object>(inputData);
		
		// 删除所有和root相同的元素
		inputData.removeAll(rootData);
		//和输入input比较，把input还有的数据全部删掉就是刚才删除的了
		removeData.removeAll(inputData);
		
		rootData.removeAll(removeData);
		
		//测试输出
		System.out.println("i:"+inputData);
		System.out.println("remove:"+removeData);
		System.out.println("root:"+rootData);
	}

}
