package real.second;

import model.Person;

public class NormalRealPerson extends RealPerson {

	public NormalRealPerson(Person person) {
		super(person);
	}
	
	@Override
	public void walk() {
		System.out.println("Person" + getPerson() + " is walking");
	}

}
