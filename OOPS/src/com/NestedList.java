package com.HashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedList {
	public static void main(String[] args) {
		List<List<Map<String, Integer>>> listOfListOfMap = new ArrayList<List<Map<String, Integer>>>();
		Map<String, Integer> map = new HashMap<>();
		map.put("Sarvesh", 25);
		map.put("Parvesh", 42);

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Sarvesh", 25);
		map1.put("Parvesh", 42);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Sarvesh", 25);
		map2.put("Parvesh", 42);

		List<Map<String, Integer>> listofmap = new ArrayList<>();
		listofmap.add(map);
		listofmap.add(map1);
		listofmap.add(map2);

		List<Map<String, Integer>> listofmap1 = new ArrayList<>();
		listofmap1.add(map);
		listofmap1.add(map1);
		listofmap1.add(map2);

		List<Map<String, Integer>> listofmap2 = new ArrayList<>();
		listofmap2.add(map);
		listofmap2.add(map1);
		listofmap2.add(map2);

		listOfListOfMap.add(listofmap);
		listOfListOfMap.add(listofmap1);
		listOfListOfMap.add(listofmap2);

		System.out.println(listOfListOfMap);

		String s = new String("sarvesh");
		String s1 = "sarvesh";
		System.out.println(s.intern() == s1);
		;
	}
}
