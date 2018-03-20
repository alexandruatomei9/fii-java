package real.behavior.impl;

import model.Person;
import real.behavior.WalkingBehaviour;

public class UnsupportedWalkingBehaviour implements WalkingBehaviour {

	@Override
	public void walk(Person person) {
		throw new UnsupportedOperationException();
	}

}
