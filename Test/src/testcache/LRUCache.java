package testcache;

import java.util.LinkedHashMap;

/**
 * Least Recently Used �������ʹ����̭ԭ��
 * 
 * @Function:LRUCache
 * @Description:
 * @param:
 * @version: v1.0.0
 * @author yu
 * @date :2018.05.09����11:05:29
 *
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = -6961971805261804885L;

	private final int SIZE;

	public LRUCache(int size) {
		super(size, 0.75f, true);
		SIZE = size;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > SIZE;
	}

	public static void main(String[] args) {
		LRUCache<Integer, Integer> map = new LRUCache<>(10);

		for (int i = 0; i++ < 10;) {
			map.put(i, i); // ����1-10��10������
		}
		System.out.println("��ʼ�洢�����" + map.toString());// ��ӡ��ʼ�洢���

		map.get(7);
		System.out.println("����һ���Ѵ��ڵ����ݣ�" + map.toString());// ��ӡ����֮������

		map.put(8, 8 + 1); // ����һ���Ѵ��ڵ����ݣ�Ҳ��������һ�λ����е�����
		System.out.println("����һ���Ѵ��ڵ����ݣ�" + map.toString());// ��ӡ����֮������

		map.put(11, 11); // �ִ��뻺��֮�������
		System.out.println("����һ�����ݺ�" + map.toString());// ��ӡ�ִ洢һ������֮������

	}
}
