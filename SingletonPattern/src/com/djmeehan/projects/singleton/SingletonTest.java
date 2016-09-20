package com.djmeehan.projects.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testCreateNewSingleton() {
		
		// Fails because the Constructor for singleton is not visible
		// Singleton instance = new Singleton();
		
		Singleton instance = Singleton.getInstance();
		assertNotNull(instance);
	}

	@Test
	public void testMultipleSingletonsAreSameObject() {
		
		// Create two references to the same singleton object
		// Test they refer to the same object
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		assertSame(instance1, instance2);;
	}
	
	@Test
	public void testMultipleNonSingletonsAreNotSameObject() {
		
		// Create two new objects of the same type
		// Test they refer to two unique objects
		NonSingleton instance1 = NonSingleton.getInstance();
		NonSingleton instance2 = NonSingleton.getInstance();
		
		assertNotSame(instance1, instance2);;
	}
	
	
}
