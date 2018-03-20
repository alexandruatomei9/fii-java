package real.view;

import model.Person;

/**
 * Strategy for displaying a person
 * 
 * @author Softvision
 * @since 17/03/2018
 *
 */
public interface ViewStrategy {
	public String display(Person person);
}
