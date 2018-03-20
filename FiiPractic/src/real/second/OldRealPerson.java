package real.second;

import model.Person;

public class OldRealPerson extends RealPerson {

	public OldRealPerson(Person person) {
		super(person);
	}
	
	@Override
	public void walk() {
		System.out.println("Old person " + getPerson() + " has difficulties walking...");
	}

}
