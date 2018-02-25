package com.core.java;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
	static void getOccuranceOfWord(String[] strList) {
		Map<String, Integer> mapList = new HashMap<String, Integer>();
		for (int i = 0; i < strList.length; i++) {
			if (mapList.get(strList[i]) != null && mapList.get(strList[i]) >= 1) {
				mapList.put(strList[i], mapList.get(strList[i]) + 1);
			} else {
				mapList.put(strList[i], 1);
			}
		}
		for (Map.Entry<String, Integer> mapVal : mapList.entrySet()) {
			System.out.print(mapVal.getKey() + " " + mapVal.getValue() + " ");
		}

	}

	public static void main(String[] args) {
		String str = "sarvesh is good boy, boy, boy, but sometimes sarvesh sarvesh sarvesh is is is better sarvesh"
				.trim();
		str = str.replaceAll("[^\\dA-Za-z ]", "");
		String[] strList = str.split(" ");
		getOccuranceOfWord(strList);
	}
}
