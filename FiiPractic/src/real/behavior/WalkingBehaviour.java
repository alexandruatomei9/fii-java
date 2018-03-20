package real.behavior;

import model.Person;
import real.exc.UnknownWalkingBehaviour;

/**
 * Describes a walking behaviour 
 * 
 * @author Softvision
 * @since 17/03/2018
 *
 */
public interface WalkingBehaviour {
	/**
	 * Defines a person's walking 
	 * May throw an UnsupportedOperationException to describe a No-Walk behaviour
	 * 
	 * @param person
	 * @throws UnknownWalkingBehaviour
	 */
	void walk(Person person) throws UnknownWalkingBehaviour;
}
