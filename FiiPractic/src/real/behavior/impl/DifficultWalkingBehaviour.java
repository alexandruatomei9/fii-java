package real.behavior.impl;

import model.Person;
import real.behavior.WalkingBehaviour;

public class DifficultWalkingBehaviour implements WalkingBehaviour {

	@Override
	public void walk(Person person) {
		System.out.println(person + " has difficulties walking");		
	}

}
