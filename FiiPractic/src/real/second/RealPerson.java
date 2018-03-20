package real.second;

import model.Person;

/**
 * Models a Real Person that can walk.
 * exposes an abstract walk method that concrete classes must define
 * PROBLEM : we must expose a new concrete class for each type of person that walks differently
 * Currently we have Normal, Baby and Old Person implementations but this could lead to a class explosion
 * 
 * @author Softvision
 * @since 17/03/2018
 *
 */
public abstract class RealPerson {
	
	private final Person person;

	protected RealPerson(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}
	
	public abstract void walk();
}