package main.java.ro.sv.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StartingClass {

	public static void main(String args[]) {
	}

	private static void legacyWay() {
		/*
		 * Here's a review of a pre-Java 5 ArrayList intended to hold Strings. (We say
		 * "intended" because that's about all you had—good intentions—to make sure that
		 * the ArrayList would hold only Strings).
		 */
		List myList = new ArrayList(); // can't declare a type
		myList.add("Fred"); // OK, it will hold Strings
		myList.add(new Dog()); // and it will hold Dogs too
		myList.add(new Integer(42)); // and Integers...

		// Reading objects from the list requires cast
		myList.get(1); // this is an Object and requires cast
		String s = (String) myList.get(1); // this will fail at runtime with a ClassCastException, as we're trying to
											// convert a Dog to a String
	}

	private static void usingGenerics() {
		/*
		 * So, generics takes care of both ends (the putting in and getting out) by
		 * enforcing the type of your collections.
		 */
		List<String> myList = new ArrayList<String>();
		myList.add("Dromihete"); // OK, it will hold Strings
		// myList.add(new Dog()); // compiler error!!

		String s = (String) myList.get(0); // pre-generics, when a String wasn't guaranteed
		// we can now just say
		String s2 = myList.get(0);
	}

	private void takeListOfStrings(List<String> strings) {
		strings.add("foo"); // no problem adding a String
	}

	private void takeListOfStringsNotOk(List<String> strings) {
		strings.add(new Integer(42)); // NO!! strings is type safe
	}

	// Return types can obviously be declared type safe as well:
	public List<Dog> getDogList() {
		List<Dog> dogs = new ArrayList<Dog>();
		// more code to insert dogs
		return dogs;
	}

	public void unleashDogs() {
		Dog d = getDogList().get(0); // we (the compiler) KNOW a Dog is coming out
	}

	// Mixing Generic and Non-generic Collections
	private void sendGenericListAsLegacyList() {
		List<Integer> myList = new ArrayList<Integer>();
		// type safe collection
		myList.add(4);
		myList.add(6);

		// pass it to an untyped argument
		int total = sumAll(myList);

		// I don't know what will be inserted here! :(
		insert(myList);
	}

	// Consider this method being part of a third party legacy library
	private int sumAll(List list) {
		// method with a non-generic List argument,
		// but ASSUMES (with no guarantee) that it will be Integers
		Iterator it = list.iterator();
		int total = 0;
		while (it.hasNext()) {
			int i = ((Integer) it.next()).intValue();
			total += i;
		}
		return total;
		// THIS WORKS FINE
	}

	// Consider this method being part of a third party legacy library
	private void insert(List list) {
		list.add(new String("42")); // put a String in the list passed in
		// So, if we pass a list typed as Integer, it will work? YES! because of type
		// erasure. But again, why type erasure? Because it needs to be backward
		// compatible with legacy code
		// But we will have troubles when we read element from within a list of
		// Integers, and we don't know it is hiding a String inside it.
	}

	// Polymorphism and Generics
	private void genericsAndPolymorphism() {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Animal> animalList2 = new ArrayList<>(); // starting from Java7 the type is inferred
		animalList.add(new Dog());
		animalList.add(new Cat());

		List<Animal> animalList3 = new ArrayList<Dog>(); // Why is this not working?

		Animal[] animalArray = new Dog[10]; // Why is this working?

		List<Dog> dogList = new ArrayList<>();
		doSomethingWithTheAnimal(dogList); // Why is this not working?
		doSomethingWithTheAnimal2(dogList);
		doSomethingWithTheAnimal3(new ArrayList<Animal>());

		cageAnimal(animalArray);
		cageAnimal(new Cat[10]);
	}

	private void doSomethingWithTheAnimal(List<Animal> animalList) {
		// The type erasure (again) will let us add a cat within a dog list, so that is
		// why the
		// compiler does not let us to call the method with subtypes of Animal
		animalList.add(new Cat());
	}

	private void doSomethingWithTheAnimal2(List<? extends Animal> animalList) {
		// Wildcard ? lets you call this method with any subtype of Animal, but does not
		// let you add anything!
		animalList.add(new Dog());
	}

	private void doSomethingWithTheAnimal3(List<? super Dog> animalList) {
		// add is allowed on ? super
		animalList.add(new Dog()); // you can add any subtype of Dog
	}

	private void cageAnimal(Animal[] animalArray) {
		animalArray[0] = new Dog(); // will throw an ArrayStoreException at runtime if we pass an array of cats, but
									// will pass at compile time.

		// Bottom line: JVM knows the type of array at runtime, so it will pass at
		// compile time for such case,
		// as for the generic collections, because of type erasure,
		// the JVM does not know the type, and the check will be done at compile time!
	}

}
