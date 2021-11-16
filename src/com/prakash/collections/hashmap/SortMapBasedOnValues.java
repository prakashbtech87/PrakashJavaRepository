package com.prakash.collections.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapBasedOnValues {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee(1, "bob"));
		map.put(2, new Employee(2, "alice"));
		map.put(3, new Employee(3, "charlie"));
		System.out.println("Before Sorting using Employee Name");
		printMap(map);
		Map<Integer, Employee> sortedMap = sortMap(map);
		System.out.println("\nAfter Sorting using Employee Name");
		printMap(sortedMap);

	}

	private static Map<Integer, Employee> sortMap(Map<Integer, Employee> map) {
		List<Entry<Integer, Employee>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Employee>>() {

			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}
		});

		Map<Integer, Employee> sortMap = new LinkedHashMap<Integer, Employee>();
		for (Entry<Integer, Employee> entry : list) {
			sortMap.put(entry.getKey(), entry.getValue());
		}

		return sortMap;
	}

	private static void printMap(Map<Integer, Employee> map) {
		for (Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}

	}

}
