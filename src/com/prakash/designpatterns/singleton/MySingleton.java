package com.prakash.designpatterns.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

//make this class as Singleton
class MyClass implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MyClass instance;

	private MyClass() {

		// no arg constructor
	}

	public static MyClass getInstance() {

		if (instance == null) {

			synchronized (MyClass.class) {

				if (instance == null) {

					instance = new MyClass();
				}
			}

		}

		return instance;

	}

	protected Object readResolved() {
		return instance;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}

}

public class MySingleton {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = (ArrayList<Integer>) Arrays.asList(1, 3, 5, 7, 8, 10, 15, 24, 25, 36, 45, 100, 101,
				202);
		// please print only even numbers which are divisble by 5 using JAVA 8 STREAMS
		// API

	}
}
