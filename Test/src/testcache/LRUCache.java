package testcache;

import java.util.LinkedHashMap;

/**
 * Least Recently Used 最近最少使用淘汰原则
 * 
 * @Function:LRUCache
 * @Description:
 * @param:
 * @version: v1.0.0
 * @author yu
 * @date :2018.05.09上午11:05:29
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
			map.put(i, i); // 放入1-10总10个数据
		}
		System.out.println("起始存储情况：" + map.toString());// 打印起始存储情况

		map.get(7);
		System.out.println("命中一个已存在的数据：" + map.toString());// 打印命中之后的情况

		map.put(8, 8 + 1); // 存入一个已存在的数据，也就是命中一次缓存中的数据
		System.out.println("覆盖一个已存在的数据：" + map.toString());// 打印命中之后的情况

		map.put(11, 11); // 又存入缓存之外的数据
		System.out.println("新增一个数据后：" + map.toString());// 打印又存储一个数据之后的情况

	}
}
