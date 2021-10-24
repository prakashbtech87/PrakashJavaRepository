package com.prakash.collections.treeset;

import java.util.TreeSet;

public class TreeSetAlphabeticalStringBuffer {

	public static void main(String[] args) {
		
		TreeSet <StringBuilder> ts = new TreeSet<>();
		ts.add(new StringBuilder("K"));
		ts.add(new StringBuilder("Z"));
		ts.add(new StringBuilder("P"));
		ts.add(new StringBuilder("a"));
		ts.add(new StringBuilder("S"));
		ts.add(new StringBuilder("A"));
		System.out.println(ts);
	}

}
