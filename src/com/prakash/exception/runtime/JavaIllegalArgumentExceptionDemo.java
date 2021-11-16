package com.prakash.exception.runtime;

import java.util.ArrayList;

public class JavaIllegalArgumentExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("going to sleep");
		Thread.currentThread().sleep(-1);
		System.out.println("sletp and waking");
	}

}
