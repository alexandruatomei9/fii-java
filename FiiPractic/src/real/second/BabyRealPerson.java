package real.second;

import model.Person;

public class BabyRealPerson extends RealPerson {

	public BabyRealPerson(Person person) {
		super(person);
	}
	
	@Override
	public void walk() {
		System.out.println("Baby " + getPerson() + " cannot walk");
	}

}
