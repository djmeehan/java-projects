package com.djmeehan.projects.singleton;

public class NonSingleton {
	
	// Demonstrate normal behaviour where a singleton is not used
	
	// Note constructor is package level access by default
	NonSingleton() {}

	public static NonSingleton getInstance() {
		return new NonSingleton();
	}
}
