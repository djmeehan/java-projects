package com.djmeehan.projects.singleton;

public class Singleton {

	// Ensure only one object gets created at any one time and control how it is created
	
	// Create an object of Singleton class
	private static Singleton instance = new Singleton();
	
	/* Make the constructor private so that this class cannot be instantiated
	 * by another way
	 */
	private Singleton() {}
	
	/* Get the object available (method should be accessible without creating an object
	 *  so make static
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}
