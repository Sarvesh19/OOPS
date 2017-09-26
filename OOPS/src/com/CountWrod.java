package com.snippet;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountWrod {
	// static
	static void countWord(List<String> list) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.toArray()[i].equals(list.toArray()[j])) {
					count++;
					map.put((String) list.toArray()[i], count);
				}
			}
		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int snum = sc.nextInt();
		List<String> l = new LinkedList<>();
		for (int i = 0; i < snum; i++) {
			l.add(sc.next());
		}

//		String[] s = { "s", "e", "d", "q", "s", "d", "y" };
//		List<String> list = Arrays.asList(s);
		
		
		
		countWord(l);
		sc.close();

	}
}
