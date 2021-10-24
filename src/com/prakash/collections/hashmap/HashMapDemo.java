package com.prakash.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Prakash");
		map.put("Address", "Kalivelampatti");

		// Print the map
		System.out.println("Map1: " + map);

		map.compute("Name", (k, v) -> v.concat(" Karuppusamy"));

		// print new mapping
		System.out.println("\nMap2: " + map);
	}

}
