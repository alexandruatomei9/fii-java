package real.first;

import model.Citizen;
import model.Person;
import model.Student;

/**
 * A Real Person implementation that can walk.
 * PROBLEM : all persons walk the same way!!!
 * 
 * @author Softvision
 * @since 17/03/2018
 * 
 */
public class RealPerson {
	
	private final Person person;

	public RealPerson(Person person) {		
		this.person = person;
	}
		
	public Person getPerson() {
		return person;
	}

	public void walk() {
		System.out.println("Person " + getPerson() + " is walking");
	}
	
	public static void main(String args[]) {
		RealPerson[] array = new RealPerson[5];
		array[0] = new RealPerson(new Citizen("Ionel", "Vasilescu", 24, "234543150694"));
		array[1] = new RealPerson(new Citizen("Marian", "Ionescu", 34, "235543150684"));
		array[2] = new RealPerson(new Student("George", "Ion", 21, "234543120694"));
		array[3] = new RealPerson(new Citizen("Cristian", "Popescu", 37, "234543150681"));
		array[4] = new RealPerson(new Citizen("Alexandru", "Vasilescu", 25, "333543110183"));
		
		for (int i=0; i<array.length; i++) {
			array[i].walk();
		}
	}
}
