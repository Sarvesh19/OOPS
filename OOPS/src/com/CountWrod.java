package com.snippet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountWrod {
	static void countWord(List<String> list, boolean forList) {
		if (forList) {
			Object s[] = list.toArray();

			List<String> slist = new LinkedList<>();
			List<String> slist1 = null;
			for (int i = 0; i < s.length; i++) {
				String st = (String) s[i];
				String[] strlist = st.split("");
				slist1 = Arrays.asList(strlist);
				slist.addAll(slist1);
			}

			Map<String, Integer> map = new LinkedHashMap<>();
			for (int i = 0; i < slist.size(); i++) {
				int count = 0;
				for (int j = 0; j < slist.size(); j++) {
					if (slist.toArray()[i].equals(slist.toArray()[j])) {
						count++;
						map.put((String) slist.toArray()[i], count);
					}
				}
			}

			for (Map.Entry<String, Integer> m : map.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}

		} else {
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

	}
	
	private static void countWordByMap(){
		String str = "I am a Boy I am a";
		String[] splitStr = str.split(" ");

		Map<String, Integer> wordCount = new HashMap<>();
		for (String word: splitStr) {
		    if (wordCount.containsKey(word)) {
		        // Map already contains the word key. Just increment it's count by 1
		        wordCount.put(word, wordCount.get(word) + 1);
		    } else {
		        // Map doesn't have mapping for word. Add one with count = 1
		        wordCount.put(word, 1);
		    }
		}
	//	And then simply iterate over the map, and print the key: value pair:

		for (Entry<String, Integer> entry: wordCount.entrySet()) {
		    System.out.println("Count of : " + entry.getKey() + 
		                       " in sentence = " + entry.getValue());
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

		// String[] s = { "s", "e", "d", "q", "s", "d", "y" };
		// List<String> list = Arrays.asList(s);

		countWord(l, true);
		countWord(l, false);
		sc.close();
		
		countWordByMap();

	}
}
