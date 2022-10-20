package com.java8;

// Java 8 introduces a new concept of default method implementation in interfaces. This capability is added for backward compatibility so that old interfaces can be used to leverage the lambda expression capability of Java 8.

// For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration. Thus, adding such method will simply break the collection framework implementations. Java 8 introduces default method so that List/Collection interface can have a default implementation of forEach method, and the class implementing these interfaces need not implement the same.

public class DefaultMethods {

	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}

//Multiple Defaults
// With default functions in interfaces, there is a possibility that a class is implementing two interfaces with same default methods. The following code explains how this ambiguity can be resolved.

interface Vehicle {

	default void print() {
		System.out.println("I am a vehicle!");
	}

	//An interface can also have static helper methods from Java 8 onwards.
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler {

	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler {

	public void print() {
		//call the default method of the specified interface using super.
		Vehicle.super.print();
		FourWheeler.super.print();
		//call the static helper method of the specified interface
		Vehicle.blowHorn();
		// own method that overrides the default implementation.
		System.out.println("I am a car!");
	}
}