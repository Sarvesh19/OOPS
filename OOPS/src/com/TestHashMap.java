package com.HashMapTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.encapsulation.Employee;

public class TestHashMap {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpid(1);
		e.setSal(15420.30);
		e.setEmpName("Sarvesh");
		Employee e1 = new Employee();
		e1.setEmpid(19);
		e1.setSal(15420.30);
		e1.setEmpName("Parvesh");
		Employee e2 = new Employee();
		e2.setEmpid(1);
		e2.setSal(15420.30);
		e2.setEmpName("Sarvesh");

		Map<Employee, Integer> map = new HashMap<>();
		map.put(e, 14);
		map.put(e1, 75);
		map.put(e2, 96);

		map.put(null, 150);
		map.put(null, 150);
		map.put(null, 150);
		map.put(null, 1505);
		map.put(null, null);
		map.put(null, null);
		// Iterator<Map.Entry<Employee, Integer>> getIt = map.entrySet()
		// .iterator();
		//
		// while (getIt.hasNext()) {
		// System.out.println(getIt.next().getKey().getEmpName() + " "
		// + getIt.next().getValue());
		// }

		for (Map.Entry<Employee, Integer> val : map.entrySet()) {
			if (val.getKey() != null)
				System.out.println(val.getKey().getEmpName() + " "
						+ val.getValue());
			else {
				System.out.println(val.getKey() + " " + val.getValue());
			}
		}
		System.out.println("================");
		Set<Employee> s = new HashSet<>();
		System.out.println(s.add(e));;
		System.out.println(s.add(e2));;
		System.out.println(s.add(e1));;
		
		
		for (Employee employee : s) {
			System.out.println(employee.getEmpName());
		}
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	}
}
