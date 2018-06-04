package testcache;

import java.util.LinkedHashMap;

/**
 * 先进先出原则（队列）
 * 
 * @Function:FIFOCache
 * @Description:
 * @param:
 * @version: v1.0.0
 * @author yu
 * @date :2018.05.09上午11:03:00
 *
 */
public class FIFOCache<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1537943831042841301L;

	private final int SIZE;

	public FIFOCache(int size) {
		super();
		SIZE = size;
	}

	// 重写淘汰机制
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {

		return size() > SIZE;
	}

	public static void main(String[] args) {
		FIFOCache<Integer, Integer> map = new FIFOCache<Integer, Integer>(10);

		for (int i = 1; i <= 10; i++) {
			map.put(i, i);
		}
		System.out.println("起始存储情况：" + map.toString());// 打印起始存储情况

		map.put(8, 9); // 存入一个已存在的数据，也就是命中一次缓存中的数据
		System.out.println("命中一个已存在的数据：" + map.toString());// 打印命中之后的情况

		map.put(11, 11); // 又存入缓存之外的数据
		System.out.println("新增一个数据后：" + map.toString());// 打印又存储一个数据之后的情况
	}
}
