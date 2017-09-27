package com.HashMapTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordOccurance {

	static Map<String, Integer> getWordOccurd(String[] str) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}

		return map;
	}

	public static void main(String[] args) {

		String str[] = { "frdd", "frf", "tgff", "yhh", "yhh" };
		Map<String, Integer> mapList = getWordOccurd(str);
		
//		Map<? extends Object,? extends Object> map1 = new HashMap<>();
//		map1.put("42", 14);
		
//		List<?> l = new ArrayList<>();
		
		

		for (Map.Entry<String, Integer> map : mapList.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

	}
}
