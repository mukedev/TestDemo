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
		//����������ȫ�����Ƹ�������������
		removeData = new ArrayList<Object>(inputData);
		
		// ɾ�����к�root��ͬ��Ԫ��
		inputData.removeAll(rootData);
		//������input�Ƚϣ���input���е�����ȫ��ɾ�����Ǹղ�ɾ������
		removeData.removeAll(inputData);
		
		rootData.removeAll(removeData);
		
		//�������
		System.out.println("i:"+inputData);
		System.out.println("remove:"+removeData);
		System.out.println("root:"+rootData);
	}

}
