package ysg.tkm.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollectionSample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// リストにデータを追加する
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		System.out.println("*** List ***");
		printValue(list);

		// 文字列型の配列を上と同じように作る
		String[] arr = new String[] {"aaa", "bbb", "ccc"};

		System.out.println("*** String[] ***");
		printValue(arr);

		list.clear();
		System.out.println("*** Clear ***");
		printValue(list);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "3value1");

		System.out.println("*** HashMap ***");
		printValue(map);

		System.out.println("mapのkey2: " + map.get("key2"));

		System.out.println("*** ClearMap ***");
		map.clear();
		printValue(map);
	}

	public static void printValue(ArrayList<String> list) {
		// 拡張for文
		for (String value : list) {
			System.out.println(value);
		}
	}
	public static void printValue(HashMap map) {
		Set<String> set = map.keySet();
		for (String value : set) {
			System.out.println(value);
		}
	}
	public static void printValue(String[] arr) {
		for (String value : arr) {
			System.out.println(value);
		}
	}

}
