package real.behavior.impl;

import model.Person;
import real.behavior.WalkingBehaviour;
import real.exc.UnknownWalkingBehaviour;

public class DefaultWalkingBehaviour implements WalkingBehaviour {

	@Override
	public void walk(Person person) throws UnknownWalkingBehaviour {
		throw new UnknownWalkingBehaviour("Person walking mode unknown");

	}

}
