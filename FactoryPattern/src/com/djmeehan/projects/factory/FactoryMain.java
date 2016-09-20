package com.djmeehan.projects.factory;

import com.djmeehan.projects.factory.phone.Android;
import com.djmeehan.projects.factory.phone.IOS;
import com.djmeehan.projects.factory.phone.OS;
import com.djmeehan.projects.factory.phone.OperatingSystemFactory;
import com.djmeehan.projects.factory.phone.Windows;

public class FactoryMain {

	public static void main(String[] args) {

		/* Behaviour is determined by object type
		 *  In future, if we need to change or add an OS type, code change/recompile
		 *  required. type keyword is exposed. 
		 */
		
		OS obj1 = new Android();
		obj1.spec();
		
		OS obj2 = new IOS();
		obj2.spec();
		
		OS obj3 = new Windows();
		obj3.spec();
		
		
		/* Instead use a class that returns an object (a factory class) .
		 *  his client application does not change if IOS becomes the most powerful
		 *  or is replaced altogether.
		 *  
		 *  Class is chosen at runtime. Client app doesnt need to know possibilities.
		 */
		System.out.println();
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		OS obj4 = osf.getInstance("Open");
		obj4.spec();
		
		OS obj5 = osf.getInstance("Closed");
		obj5.spec();
		
		OS obj6 = osf.getInstance("other");
		obj6.spec();
		
	}

}
