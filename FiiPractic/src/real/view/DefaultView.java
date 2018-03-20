package real.view;

import model.Person;

public class DefaultView implements ViewStrategy {

	@Override
	public String display(Person person) {	
		return person.getFirstName() + " " + person.getLastName() + " ( age : " + person.getAge() + ")";
	}

}
