package real.behavior.impl;

import model.Person;
import real.behavior.WalkingBehaviour;

public class NoWalkingBehaviour implements WalkingBehaviour {

	@Override
	public void walk(Person person) {
		System.out.println(person + " cannot walk");
	}

}
