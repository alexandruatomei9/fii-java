package real.view;

import model.Person;

/**
 * Simple display of a Person
 * 
 * @author Softvision
 * @since 17/03/2018
 *
 */
public class SimpleView implements ViewStrategy {
	
	public String display(Person person) {
		return person.getFirstName() + " " + person.getLastName();
	}
}
