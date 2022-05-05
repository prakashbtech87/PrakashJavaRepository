package com.prakash.designpatterns.singleton;

import java.io.Serializable;

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

		MyClass obj1 = MyClass.getInstance();
		MyClass obj2 = MyClass.getInstance();
		System.out.println(obj1==obj2);
		
		
	}
}
