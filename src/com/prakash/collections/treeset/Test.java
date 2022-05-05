package com.prakash.collections.treeset;

public class Test {

	public static void main(String[] args) {
		System.out.println("Total  :"+Runtime.getRuntime().totalMemory()/(1024*1024));
		System.out.println("Max    :"+Runtime.getRuntime().maxMemory()/(1024*1024));
		System.out.println("FreeMem:"+Runtime.getRuntime().freeMemory()/(1024*1024));
		System.out.println("UsedMem:"+(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/(1024*1024));
	}
}
